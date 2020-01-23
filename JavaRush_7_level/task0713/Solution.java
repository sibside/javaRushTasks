package com.javarush.task.task07.task0713;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listIn = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        for(int i = 0; i < 20; i++)
            listIn.add(Integer.parseInt(reader.readLine()));

        for(int i = 0; i < 20; i++){
            if (listIn.get(i)%3==0 && listIn.get(i)%2==0){
                list3.add(listIn.get(i));
                list2.add(listIn.get(i));
            }
            else if (listIn.get(i)%3==0)
                list3.add(listIn.get(i));
            else if (listIn.get(i)%2==0)
                list2.add(listIn.get(i));
            else
                listOther.add(listIn.get(i));
        }
        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
