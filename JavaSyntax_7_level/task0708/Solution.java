package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        strings = new ArrayList<>();
        // создаем буффер потока чтения входящих данных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // создаем цикл для заполнение основного списочного массива strings
        for (int i = 0; i < 5; i++)
            strings.add(reader.readLine());
        String max = strings.get(0);
        // ищем максимальный
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max.length()) {
                max = strings.get(i);
            }
        }
        // выводим максимальную строку по длине / максимальные строки
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == max.length())
                System.out.println(strings.get(i));
        }
    }
}
