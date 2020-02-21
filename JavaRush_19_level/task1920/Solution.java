package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String line;
        Double maxValue = 0.0;
        while ((line=reader.readLine())!=null){
            String[] buff = line.split(" ");
            if(!map.containsKey(buff[0]))
                map.putIfAbsent(buff[0], Double.parseDouble(buff[1]));
            else
                map.computeIfPresent(buff[0], (a,b)->b += Double.parseDouble(buff[1]));
        }
        reader.close();

        for(Map.Entry<String, Double> pair : map.entrySet()){
            if(pair.getValue() > maxValue) {
                maxValue = pair.getValue();
            }
        }

        for(Map.Entry<String, Double> pair : map.entrySet()){
            if(pair.getValue().equals(maxValue))
                System.out.println(pair.getKey());
        }
    }
}
