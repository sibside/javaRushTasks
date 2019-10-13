package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrHouse = new int[15];
        int maxEven = 0;
        int maxOdd = 0;

        for (int i = 0; i < 15; i++)
            arrHouse[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 15; i++){
            if(i%2==0 || i==0)
                maxEven = arrHouse[i] + maxEven;
            else
                maxOdd = arrHouse[i] + maxOdd;
        }
        if(maxEven > maxOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
