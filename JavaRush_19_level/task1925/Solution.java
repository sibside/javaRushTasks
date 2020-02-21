package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);

        StringJoiner stringJoiner = new StringJoiner(",");
        String line;
        while((line = reader.readLine()) != null){
            String[] buff = line.split(" ");
            for(String s : buff){
                if(s.length()>6)
                    stringJoiner.add(s);
            }
        }
        writer.write(stringJoiner.toString());

        reader.close();
        writer.close();
    }
}
