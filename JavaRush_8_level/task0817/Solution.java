package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() { // Метод создает Map типа HashMap и заполняет его
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>(); // создание HashMap - map
        map.put("Васильев", "Андрей"); // заполнение map новым элементом где Key - Value
        map.put("Кузнецов", "Сергей");
        map.put("Сидоров", "Андрей");
        map.put("Гуляев", "Андрей");
        map.put("Тимохин", "Пётр");
        map.put("Кучко", "Антон");
        map.put("Петров", "Пётр");
        map.put("Федоров", "Андрей");
        map.put("Ильин", "Андрей");
        map.put("Томарин", "Сергей");

        return map; // возращает готовый заполненный Map
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> eList = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
                Map.Entry<String, String> pair = iterator.next();
                String value = pair.getValue();
                arrayList.add(value);
        }
        //Sort ArrayList
        for(int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            String tmp = arrayList.get(i);
            for (String aRR : arrayList) {
                if (tmp.equals(aRR))
                    count++;
            }
            if(count > 1){
                eList.add(tmp);
            }
        }

        for(int i = 0; i < eList.size(); i++)
            removeItemFromMapByValue(map, eList.get(i));
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
