package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        Cat cat1 = new Cat("Vasya");
        catMap.put(cat1.name, cat1);
        Cat cat2 = new Cat("Kuzya");
        catMap.put(cat2.name, cat2);
        Cat cat3 = new Cat("Tolya");
        catMap.put(cat3.name, cat3);
        Cat cat4 = new Cat("Batya");
        catMap.put(cat4.name, cat4);
        Cat cat5 = new Cat("Ninja");
        catMap.put(cat5.name, cat5);
        Cat cat6 = new Cat("Tommy");
        catMap.put(cat6.name, cat6);
        Cat cat7 = new Cat("Komma");
        catMap.put(cat7.name, cat7);
        Cat cat8 = new Cat("Topi");
        catMap.put(cat8.name, cat8);
        Cat cat9 = new Cat("Pikl");
        catMap.put(cat9.name, cat9);
        Cat cat10 = new Cat("Viking");
        catMap.put(cat10.name, cat10);

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        Iterator<Map.Entry<String,Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> pair = iterator.next();
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
