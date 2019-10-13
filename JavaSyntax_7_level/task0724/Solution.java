package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFatherOne = new Human("Vasya",true,76);
        Human grandFatherTwo = new Human("Peter", true, 61);
        Human grandMotherOne = new Human("Marya", false, 66);
        Human grandMotherTwo = new Human("Svetlana", false, 62);
        Human Father = new Human("Sergey", true, 41, grandMotherOne, grandFatherOne);
        Human Mother = new Human("Svetlana", false, 40, grandMotherTwo, grandFatherTwo);
        Human Son = new Human("Denis", true, 18, Mother, Father);
        Human Son2 = new Human("Grek", true, 21, Mother, Father);
        Human Daugther = new Human("Anna", false, 19, Mother, Father);

        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Son);
        System.out.println(Son2);
        System.out.println(Daugther);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}