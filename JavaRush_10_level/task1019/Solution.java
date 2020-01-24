package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true){
            String id = reader.readLine();
            if (id.equals(""))
                break;
            int ID = Integer.parseInt(id);
            String str = reader.readLine();
            if (str.equals("")){
                map.put("", ID);
                break;
            }
            map.put(str, ID);
        }

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            int id = pair.getValue();
            String name = pair.getKey();
            System.out.println(id + " " + name);
        }
    }
}
