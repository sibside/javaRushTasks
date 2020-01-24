package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Петров", 300);
        map.put("Сидоров", 499);
        map.put("Кучкин", 120);
        map.put("Мочалкин", 700);
        map.put("Родисов", 460);
        map.put("Ухманова", 500);
        map.put("Курилкин", 500);
        map.put("Жирова", 500);
        map.put("Угнева", 400);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            int value = pair.getValue();
            String name = pair.getKey();
            if(value < 500)
                names.add(name);
        }
        for(int i = names.size()-1; i >= 0; i--)
            map.remove(names.get(i));
    }

    public static void main(String[] args) {

    }
}