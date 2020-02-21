package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //сохраняем текущее состояние final переменной System.out в экземпляр декоратора PrintStream
        PrintStream consoleStream = System.out;
        //создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //Создание адаптера к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //SetUp how current stream
        System.setOut(stream);
        //It`s magic (nothing to print
        testString.printSomething();
        //из динамического массива переводим данные в строку и делаем replaceAll
        String result = outputStream.toString().replaceAll("te","??");
        //восстанавливаем поток
        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
