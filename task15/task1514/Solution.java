package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.5, "Vasya");
        labels.put(3.6, "Kuzya");
        labels.put(7.1, "Dmo");
        labels.put(100.23, "zuk");
        labels.put(1.1, "Klim");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
