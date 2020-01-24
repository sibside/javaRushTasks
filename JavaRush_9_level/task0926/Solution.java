package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> arr = new ArrayList<>();
        int[] five = new int[]{5,3,4,21,2};
        int[] two = new int[]{1,4};
        int[] four = new int[]{10,13,8,3};
        int[] seven = new int[]{1,2,3,4,5,6,7};
        int[] zero = new int[0];
        arr.add(five);
        arr.add(two);
        arr.add(four);
        arr.add(seven);
        arr.add(zero);

        return arr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
