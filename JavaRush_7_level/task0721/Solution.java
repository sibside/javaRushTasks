package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] listInt = new int[20];
        for(int i = 0; i < listInt.length; i++)
            listInt[i] = Integer.parseInt(reader.readLine());

        maximum = listInt[0];
        minimum = listInt[0];
        for(int i = 0; i < listInt.length; i++){
            if(listInt[i] > maximum)
                maximum = listInt[i];
            else if (listInt[i] < minimum)
                minimum = listInt[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
