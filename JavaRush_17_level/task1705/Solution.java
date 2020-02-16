package com.javarush.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        //создаем метод addFruit #1
        public synchronized void addFruit (int index, String fruit){
            fruits.add(index, fruit);
        }
        //создаем метод removeFruit #2
        public synchronized void removeFruit(int index){
            fruits.remove(index);
        }
        //создаем метод addVegetable #3
        public synchronized void addVegetable (int index, String vegetable){
            vegetables.add(index, vegetable);
        }
        //создаем метод removeVegetable #4
        public synchronized void removeVegetable (int index){
            vegetables.remove(index);
        }
    }
}
