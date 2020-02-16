package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Object value, int m, int n){}
    public static void printMatrix(String value, int m, int n){}
    public static void printMatrix(int m, Object value, int n){}
    public static void printMatrix(int m, String value, int n){}
    public static void printMatrix(short g, Object value, short a){}
    public static void printMatrix(short g, String value, short a){}
    public static void printMatrix(Object value, short x, short y){}
    public static void printMatrix(String value, short x, short y){}
}
