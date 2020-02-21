package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int countSpaces = 0;
        int countCharacter = 0;

        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available() > 0){
            int a = inputStream.read();
            if(a == 32){
                countSpaces++;
                countCharacter++;
            }
            else
                countCharacter++;
        }
        inputStream.close();
        System.out.printf("%.2f",(double)countSpaces/countCharacter*100);
    }
}
