package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        StringBuffer str = new StringBuffer();

        while (inputStream.available()>0){
            int a = inputStream.read();
            char b = (char) a;
            str.append(b);
        }

        List<Double> doubleList = new ArrayList<>();
        for(String a : str.toString().split(" ")){
            doubleList.add(Double.parseDouble(a));
        }
        str.delete(0, str.length());
        for(double a : doubleList){
            str.append(Math.round(a)+" ");
        }
        String result = str.toString().trim();

        ByteArrayOutputStream outputByte = new ByteArrayOutputStream();
        outputByte.write(result.getBytes());
        byte[] a = outputByte.toByteArray();
        outputStream.write(a);

        inputStream.close();
        outputStream.close();
        outputByte.close();
    }
}
