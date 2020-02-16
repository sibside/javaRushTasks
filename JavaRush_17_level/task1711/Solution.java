package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        //variables of app
        String name;
        String sex;
        Date bd;
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);

        switch (args[0]){
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        name = args[i++];
                        sex = args[i++];
                        bd = simpleDateFormat.parse(args[i++]);

                        if (sex.equals("м"))
                            allPeople.add(Person.createMale(name, bd));
                        else if (sex.equals("ж"))
                            allPeople.add(Person.createFemale(name, bd));

                        System.out.println(allPeople.indexOf(allPeople.get(allPeople.size() - 1)));
                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        int index = Integer.parseInt(args[i++]);

                        allPeople.get(index).setName(args[i++]);

                        if (args[i].equals("м"))
                            allPeople.get(index).setSex(Sex.MALE);
                        else if (args[i].equals("ж"))
                            allPeople.get(index).setSex(Sex.FEMALE);

                        i++;
                        allPeople.get(index).setBirthDate(simpleDateFormat.parse(args[i++]));
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);

                        allPeople.get(index).setSex(null);
                        allPeople.get(index).setName(null);
                        allPeople.get(index).setBirthDate(null);
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);

                        if (allPeople.get(index).getSex().equals(Sex.MALE))
                            sex = "м";
                        else
                            sex = "ж";

                        String patternOut = "dd-MMM-yyyy";
                        simpleDateFormat = new SimpleDateFormat(patternOut, Locale.ENGLISH);

                        System.out.println(allPeople.get(index).getName() + " " + sex + " "
                                + simpleDateFormat.format(allPeople.get(index).getBirthDate()));
                    }
                }
                break;
        }
    }
}
