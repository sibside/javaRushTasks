package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        while (true){
            String fileName = reader.readLine();
            try {
                inputStream = new FileInputStream(fileName);
                inputStream.close();
            }catch (FileNotFoundException e){
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
    }
}
