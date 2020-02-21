package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        Pattern p1 = Pattern.compile("[a-zA-Z]");
        Matcher m1;
        int count = 0;
        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available() > 0){
            int a = inputStream.read();
            char b = (char)a;
            String s = String.valueOf(b);
            m1 = p1.matcher(s);
            if(m1.find())
                count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
