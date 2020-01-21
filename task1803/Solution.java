package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            arrayList.add(data);
        }
        fileInputStream.close();

        //create map for search
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arrayList.size(); i++){
            int count = 0;
            for (int j = 0; j < arrayList.size(); j++){
                if(arrayList.get(i).equals(arrayList.get(j)))
                    count++;
            }
            if(count>2)
                map.put(arrayList.get(i), count);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        arrayList.clear();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> parse = iterator.next();
            arrayList.add(parse.getKey());
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        for (Integer s : arrayList)
            System.out.print(s+" ");
    }
}
