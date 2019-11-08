package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 10; i++)
            integerSet.add((int) Math.random()*100);

        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if ( i > 10)
                iterator.remove();
        }
        return (HashSet) set;
    }

    public static void main(String[] args) throws Exception {

    }
}
