package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> listStr = new ArrayList<String>();
        for(int i = 0; i < 5; i++)
            listStr.add("Text");

        System.out.println(listStr.size());
        for(int i = 0; i < listStr.size(); i++)
            System.out.println(listStr.get(i));
    }
}
