package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder str = new StringBuilder(string);
        //напишите тут ваш код
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(i == 0 & c != ' '){
                c = Character.toUpperCase(c);
                str.setCharAt(i,c);
            }
            else if (c == ' '){
                c = string.charAt(i+1);
                c = Character.toUpperCase(c);
                str.setCharAt(i+1, c);
            }
        }
        System.out.println(str);
    }
}
