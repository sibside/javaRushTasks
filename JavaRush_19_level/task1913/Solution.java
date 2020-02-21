package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //Сохраняем текущий поток вывода в переменную
        PrintStream consoleStream = System.out;
        //Create automatically array
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //Adapter for PrintStream
        PrintStream printStream = new PrintStream(outputStream);
        //
        System.setOut(printStream);

        testString.printSomething();
        String result = outputStream.toString().replaceAll("\\D","");
        System.setOut(consoleStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
