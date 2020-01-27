package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());

        StringBuffer str = new StringBuffer();

        while (inputStream.available()>0){
            int a = inputStream.read();
            char b = (char) a;
            str.append(b);
        }
        for(String a : str.toString().split(" ")) {
            double s = (double) Math.round(Double.parseDouble(a));
            int b = (int) s;
            writer.write(b+" ");
        }
        inputStream.close();
        writer.close();
    }
}
