package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        int count = 1;
        int maxcount = 0;

        for (int i = list.size()-2; i >= 0; i--) {
            if (list.get(i).equals(list.get(i + 1)))
                count++;
            else if (!(list.get(i).equals(list.get(i + 1))) & count > maxcount){
                maxcount = count;
                count = 1;
            }
            else
                count = 1;
            if (i == 0 && maxcount < count)
                maxcount = count;
        }
        System.out.println(maxcount);
    }
}