package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrLarge = new int[20];
        int[] arrSmallOne = new int[10];
        int[] arrSmallTwo = new int[10];
        for (int i = 0; i < 20; i++)
            arrLarge[i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 10; i++){
                arrSmallOne[i] = arrLarge[i];
        }
        for (int i = 0; i < 10; i++){
                arrSmallTwo[i] = arrLarge[i+10];
        }
        for (int i = 0; i < 10; i++)
            System.out.println(arrSmallTwo[i]);
    }
}
