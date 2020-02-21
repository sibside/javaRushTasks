package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);

        String line;
        Pattern pattern = Pattern.compile("\\d+");
        while ((line = reader.readLine()) != null){
            String[] buff = line.split(" ");
            for(String s : buff){
                Matcher matcher = pattern.matcher(s);
                if(matcher.find()){
                    writer.write(s+" ");
                    writer.flush();
                }
            }
        }
        reader.close();
        writer.close();

    }
}
