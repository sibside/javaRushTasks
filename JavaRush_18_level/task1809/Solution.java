package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        if(inputStream.available() > 0){
            byte[] buff = new byte[inputStream.available()];
            int count = inputStream.read(buff);
            for(int i = count-1; i >= 0; i--){
                outputStream.write(buff[i]);
            }
        }

        inputStream.close();
        outputStream.close();
    }
}
