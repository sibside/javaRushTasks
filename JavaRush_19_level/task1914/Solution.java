package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString().trim();
        String[] arr = result.split(" ");
        if(result.contains("+")){
            int c = Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            System.out.println(result+ " "+c);
        }
        else if (result.contains("*")){
            int c = Integer.parseInt(arr[0])*Integer.parseInt(String.valueOf(arr[2]));
            System.out.println(result+ " "+c);
        }
        else if(result.contains("-")){
            int c = Integer.parseInt(arr[0])-Integer.parseInt(String.valueOf(arr[2]));
            System.out.println(result+ " "+c);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

