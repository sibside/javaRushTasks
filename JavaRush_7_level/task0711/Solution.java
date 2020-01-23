package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        ArrayList<String> listStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tpm = "";
        for(int i = 0; i < 5; i++)
            listStr.add(reader.readLine());
        for(int i = 0; i < 13; i++){
            tpm = listStr.get(4);
            listStr.remove(4);
            listStr.add(0, tpm);
        }
        for(int i = 0; i < 5; i++)
            System.out.println(listStr.get(i));
}}
