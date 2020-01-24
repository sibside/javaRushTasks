package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String glas = "";
        String nGlas = "";
        for (int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if (isVowel(tmp))
                glas = glas + " " + tmp;
        }
        glas = glas.trim();
        glas = glas + " ";
        for (int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if (!isVowel(tmp) && tmp != ' ')
                nGlas = nGlas + " " + tmp;
        }
        nGlas = nGlas.trim();
        nGlas = nGlas + " ";
        System.out.println(glas);
        System.out.println(nGlas);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}