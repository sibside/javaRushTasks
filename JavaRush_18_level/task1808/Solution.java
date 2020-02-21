package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);

        if (inputStream.available() > 0){
            byte[] buff = new byte[inputStream.available()];
            int count = inputStream.read(buff);
            if (count%2==0){
                outputStream1.write(buff,0,count/2);
                outputStream2.write(buff, count/2, count/2);
            }
            else {
                outputStream1.write(buff, 0, count/2+1);
                outputStream2.write(buff,count/2+1,count/2);
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
