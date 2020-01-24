package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Сидоров", "Иван");
        map.put("Петрушкина", "Галина");
        map.put("Тарасов", "Иван");
        map.put("Сидоровой", "Кузя");
        map.put("Зайцева", "Галина");
        map.put("Андреев", "Иван");
        map.put("Чумин", "Петр");
        map.put("Аквинская", "Галина");
        map.put("Чумовой", "Иван");
        map.put("Тушкина", "Галина");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String a = pair.getValue();
            if(a.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String b = pair.getKey();
            if(b.equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
