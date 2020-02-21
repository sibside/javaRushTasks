package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] arg = fileScanner.nextLine().split(" ",4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String firstName = arg[1];
            String middleName = arg[2];
            String lastName = arg[0];
            Date birthDate = dateFormat.parse(arg[3]);
            return new Person(firstName,middleName,lastName,birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
