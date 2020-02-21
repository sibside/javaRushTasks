package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            map.put(data, 1);
        }
        fileInputStream.close();

        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            System.out.print(pair.getKey()+ " ");
        }

    }
}
