package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            arrayList.add(data);
        }
        fileInputStream.close();
        System.out.println(Collections.min(arrayList));
    }
}
