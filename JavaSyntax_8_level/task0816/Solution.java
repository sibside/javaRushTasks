package com.javarush.task.task08.task0816;

import javax.naming.event.ObjectChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Вася", dateFormat.parse("JUNE 3 1998"));
        map.put("Кузя", dateFormat.parse("AUGUST 8 1994"));
        map.put("Smith", dateFormat.parse("FEBRUARY 20 1991"));
        map.put("Mike", dateFormat.parse("AUGUST 8 1994"));
        map.put("Tike", dateFormat.parse("FEBRUARY 20 1991"));
        map.put("DoggyDog", dateFormat.parse("AUGUST 8 1994"));
        map.put("Kapp", dateFormat.parse("FEBRUARY 20 1991"));
        map.put("Nice", dateFormat.parse("AUGUST 8 1994"));
        map.put("Worth", dateFormat.parse("FEBRUARY 20 1991"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            String key = pair.getKey();
            if(value.getMonth() == 5 || value.getMonth() == 6 || value.getMonth() == 7)
                arrayList.add(0, key);
        }
        for(int i = arrayList.size()-1; i >= 0; i--)
            map.remove(arrayList.get(i));
    }

    public static void main(String[] args) throws ParseException {

    }
}
