package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут
        //variables of app
        String name;
        String sex;
        Date bd;

        String pattern = "dd/MM/yyyy";

        // -c (create - add new Person)
        if (args[0].equals("-c")){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);

            name = args[1];
            sex = args[2];
            bd = simpleDateFormat.parse(args[3]);

            if(sex.equals("м"))
                allPeople.add(Person.createMale(name, bd));
            else if (sex.equals("ж"))
                allPeople.add(Person.createFemale(name, bd));

            System.out.println(allPeople.indexOf(allPeople.get(allPeople.size()-1)));
        }

        // -u (update date of person by id)
        else if (args[0].equals("-u")){
            int index = Integer.parseInt(args[1]);

            allPeople.get(index).setName(args[2]);
            if(args[3].equals("м"))
                allPeople.get(index).setSex(Sex.MALE);
            else if (args[3].equals("ж"))
                allPeople.get(index).setSex(Sex.FEMALE);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
            bd = simpleDateFormat.parse(args[4]);
            allPeople.get(index).setBirthDate(bd);
        }

        // -d (set null for person by id)
        else if (args[0].equals("-d")){
            int index = Integer.parseInt(args[1]);

            allPeople.get(index).setBirthDate(null);
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
        }

        // -i (print data of person by id)
        else if (args[0].equals("-i")){

            int index = Integer.parseInt(args[1]);

            if(allPeople.get(index).getSex().equals(Sex.MALE))
                sex = "м";
            else
                sex = "ж";

            pattern = "dd-MMM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);

            System.out.println(allPeople.get(index).getName()+" "+sex+" "
                +simpleDateFormat.format(allPeople.get(index).getBirthDate()));
        }
    }
}
