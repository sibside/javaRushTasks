package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Creation of streams encryption/decryption
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileWriter writer = new FileWriter(args[2]);

        String test = reader.readLine();
        //Encrypting system by Nemocoder - xD
        if(args[0].equals("-e")){
            while (inputStream.available()>0){
                int a = inputStream.read();
                writer.write(a-3);
            }
        }

        //Decrypting system
        else if (args[0].equals("-d")){
            while (inputStream.available()>0){
                int a = inputStream.read();
                writer.write(a+3);
            }
        }
        inputStream.close();
        writer.close();
    }
}
