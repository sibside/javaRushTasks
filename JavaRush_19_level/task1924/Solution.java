package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null){
            String[] arr = line.split(" ");
            for(int i = 0; i < arr.length ; i++){
                if(arr[i].matches("\\b\\d+\\b")){
                    if(Integer.parseInt(arr[i])<=12) {
                        for (Map.Entry<Integer, String> pair : map.entrySet()) {
                            if (pair.getKey() == Integer.parseInt(arr[i])) {
                                if (i == arr.length - 1) {
                                    System.out.print(pair.getValue());
                                    break;
                                } else {
                                    System.out.print(pair.getValue() + " ");
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        if (i == arr.length - 1)
                            System.out.print(arr[i]);
                        else
                            System.out.print(arr[i] + " ");
                    }
                }
                else{
                    if(i==arr.length-1)
                        System.out.print(arr[i]);
                    else
                        System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        reader.close();
    }
}
