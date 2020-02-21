package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        //поток на чтение из 1 файла
        FileInputStream inputStream1 = new FileInputStream(file1);
        //создаем массив байтов под 1 файл
        byte[] buffFile1 = new byte[inputStream1.available()];
        //читаем содержимое 1 файла - никуда его не кладем (ибо всем похуй)
        inputStream1.read(buffFile1);

        //создаем поток записи в 1 файл
        FileOutputStream outputStream = new FileOutputStream(file1);

        //читаем содержимое второго файла
        FileInputStream inputStream2 = new FileInputStream(file2);
        byte[] buffFile2 = new byte[inputStream2.available()];
        inputStream2.read(buffFile2);

        outputStream.write(buffFile2, 0, buffFile2.length);
        outputStream.write(buffFile1, 0, buffFile1.length);

        inputStream1.close();
        inputStream2.close();
        outputStream.close();

    }
}
