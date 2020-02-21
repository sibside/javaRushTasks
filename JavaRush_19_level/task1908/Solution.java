package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true));
        String result = "";

        while (reader.ready()){
            int a = reader.read();
            String tmp = String.valueOf((char)a);
            result += tmp;
        }
        reader.close();

        String[] numStrings = result.split(" ");
        for (int j = 0; j < numStrings.length; j++) {
            for(int i = 0; i < numStrings[j].length(); i++){
                if(!Character.isDigit((numStrings[j].charAt(i))))
                    break;
                else if (i == numStrings[j].length()-1 & Character.isDigit((numStrings[j].charAt(i)))) {
                    if(j == numStrings.length-1)
                        writer.write(numStrings[j]);
                    else
                        writer.write(numStrings[j] + " ");
                }
            }
        }
        writer.close();
    }
}
