package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String line;
        while ((line = reader.readLine())!=null){
            //name always name[0] - date always date[1] date[2] date[3]
            String[] name = line.split("\\d");
            String[] digits = line.split("\\b\\D+\\b");

            //fucking date parsing
            //НА ВХОДЕ СТРИНГ *"31 12 2019"
            String input = digits[1]+ " "+digits[2]+" "+digits[3];
            //СОЗДАЕМ ЕБУЧИЙ СимплДатаФорматер
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            //В переменную ДАТА парсим по шаблону получаем длинную хуету
            Date date = dateFormat.parse(input);
            //ФОРМАТИРУЕМ ДАТУ ПО ШАБЛОНУ....
            //ИТОГ НА ВЫХОДЕ СТРИНГ "31 12 2019" - ОН МНЕ НАХЕР НЕ НУЖен
            PEOPLE.add(new Person(name[0].trim(), date));
        }
        reader.close();
        }
    }

