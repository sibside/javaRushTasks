package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> listStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // заполняем массив строк
        for (int i = 0; i < 10; i++)
            listStr.add(reader.readLine());

        String min=listStr.get(0);
        String max=listStr.get(0);
        for (int i = 0; i < 10; i++){
            if (min.length() >= listStr.get(i).length()) {
                min = listStr.get(i);
            }
            else if(max.length() <= listStr.get(i).length())
                max = listStr.get(i);
        }
        for (int i = 0; i < 10; i++){
            if (listStr.get(i).length() == min.length()){
                System.out.println(listStr.get(i));
                break;
            }
            else if (listStr.get(i).length() == max.length()){
                System.out.println(listStr.get(i));
                break;
            }
        }
    }
}
