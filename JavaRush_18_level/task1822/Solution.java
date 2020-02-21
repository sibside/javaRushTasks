package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new FileReader(reader.readLine()));
        String lineText = "";
        while((lineText = reader.readLine())!=null){
            String[] buff = lineText.split(" ");
            if(args[0].equals(buff[0])){
                System.out.println(lineText);
                break;
            }
        }
        reader.close();
    }
}
