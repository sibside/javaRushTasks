package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> someSet = new HashSet<>();
        someSet.add("арбуз");
        someSet.add("банан");
        someSet.add("вишня");
        someSet.add("груша");
        someSet.add("дыня");
        someSet.add("ежевика");
        someSet.add("женьшень");
        someSet.add("земляника");
        someSet.add("ирис");
        someSet.add("картофель");

        for (String s: someSet)
            System.out.println(s);
    }
}
