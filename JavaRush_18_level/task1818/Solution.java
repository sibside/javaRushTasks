package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file1, true);
        FileInputStream inputStream = new FileInputStream(file2);

       while (inputStream.available()>0){
            int a = inputStream.read();
            outputStream.write(a);
       }
       inputStream.close();
       inputStream = new FileInputStream(file3);
       while (inputStream.available()>0){
           int a = inputStream.read();
           outputStream.write(a);
       }
        outputStream.close();
        inputStream.close();
    }
}
