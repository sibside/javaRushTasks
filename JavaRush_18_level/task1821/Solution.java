package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);

        for(int i = 0; i < buff.length; i++){
            int count = 1;
            for(int j = 0; j < i; j++){
                if (buff[i]==buff[j])
                    count++;
            }
            map.put((char)buff[i], count);
        }

        for(Map.Entry<Character, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

        inputStream.close();
    }
}
