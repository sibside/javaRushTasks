package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        File file = new File("D:/"+fileName+".txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        while (true){
            String str = reader.readLine();
            if (str.equals("exit")) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                break;
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
