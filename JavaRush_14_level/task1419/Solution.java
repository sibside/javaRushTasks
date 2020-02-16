package com.javarush.task.task14.task1419;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try{
            throw new StringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e ){
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e){
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e){
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (RuntimeException e){
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e){
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        } catch (SecurityException e){
            exceptions.add(e);
        }
    }
}
