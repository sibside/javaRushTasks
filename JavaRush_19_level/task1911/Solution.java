package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream
        PrintStream consoleStream = System.out;
        //создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //устанавливаем его как текущий System.out
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString().toUpperCase();
        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
