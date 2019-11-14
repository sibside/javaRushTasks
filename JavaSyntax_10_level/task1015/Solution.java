package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>arrayLists = new ArrayList<>(Arrays.asList("Vasya","Petya", "Kolya"));
        ArrayList<String>arrayList = new ArrayList<>(Arrays.asList("Kuzya", "Nikolya", "Tolya"));
        ArrayList<String>[] result = new ArrayList[2];
        result[0] = arrayLists;
        result[1] = arrayList;

        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}