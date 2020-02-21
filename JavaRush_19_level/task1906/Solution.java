package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        int counter = 0;
        while (fileReader.ready()){
            int data = fileReader.read();
            if(!(counter%2==0)){
             fileWriter.write(data);
            }
            counter++;
        }
        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
