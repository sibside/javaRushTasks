package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true));
        String result = "";
        while (reader.ready()){
            int a = reader.read();
            String tmp = String.valueOf((char)a);
            result += tmp;
        }
        reader.close();

        String[] buff = result.split("\\p{Punct}");
        for (String s : buff)
            writer.write(s);
        writer.close();
    }
}
