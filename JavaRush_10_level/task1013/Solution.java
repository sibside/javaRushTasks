package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private int height;
        private String secondName;
        private Human human;

        public Human(){}
        public Human(String name){this.name = name;}
        public Human(int age, String name){this.age = age; this.name = name;}
        public Human(int weight) {this.weight = weight;}
        public Human(Human human) {this.human = human;}
        public Human(String name, int age){this.name = name; this.age = age; }
        public Human(String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, Human human, int age){
            this.name = name;
            this.human = human;
            this.age = age;
        }
        public Human(String name, int age, int weight, int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human(String name, int age, int weight, int height, Human human){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.human = human;
        }


    }
}
