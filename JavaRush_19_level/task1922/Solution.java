package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine())!=null){
            String[] buff = line.split("[\\p{Space}\\p{Punct}]+");
            int counter = 0;
            for(int i = 0; i < buff.length; i++){
                for (int j = 0; j < words.size(); j++){
                    if(buff[i].equals(words.get(j)))
                        counter++;
                }
            }
            if(counter == 2)
                System.out.println(line);
        }
        reader.close();
    }
}
