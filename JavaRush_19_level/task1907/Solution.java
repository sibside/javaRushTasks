package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();

        String result = "";
        while (fileReader.ready()){
            char[] buff = new char[1000];
            fileReader.read(buff);
            String tmp = String.valueOf(buff);
            result = result+tmp;
        }
        fileReader.close();

        String[] strings = result.split("[\\W]");
        int counter = 0;
        for(int i = 0; i < strings.length;i++){
            if (strings[i].equals("world"))
                counter++;
        }
        System.out.println(counter);
    }
}
