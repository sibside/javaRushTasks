package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0; // 0
        int b = a + 46; // 46
        byte c = (byte) (a * b); // 0
        double f = (char) 1234.15;
        long d = (int)(a + f / c + b);
        System.out.println(d);
    }
}
