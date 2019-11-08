package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human daughter = new Human();
        daughter.age = 14; daughter.name = "Vittoria"; daughter.sex = false;

        Human son1 = new Human();
        son1.age = 19; son1.name = "Vlad"; son1.sex = true;

        Human son = new Human();
        son.age = 18; son.name = "Nikita"; son.sex = true;

        Human mother = new Human();
        mother.age = 35; mother.name = "Alesya"; mother.sex = false;
        mother.children.add(son); mother.children.add(son1); mother.children.add(daughter);

        Human father = new Human();
        father.age = 41; father.name = "Andrey"; father.sex = true;
        father.children.add(son); father.children.add(son1); father.children.add(daughter);

        Human grandMother2 = new Human();
        grandMother2.age = 58; grandMother2.name = "Lybov"; grandMother2.sex = false; grandMother2.children.add(mother);

        Human grandMother1 = new Human();
        grandMother1.age = 58; grandMother1.name = "Lena"; grandMother1.sex = false; grandMother1.children.add(father);

        Human grandFather2 = new Human();
        grandFather2.age = 71; grandFather2.name = "Petya"; grandFather2.sex = true; grandFather2.children.add(mother);

        Human grandFather1 = new Human();
        grandFather1.age = 69; grandFather1.name = "Vasya"; grandFather1.sex = true; grandFather1.children.add(father);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(son1);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        String name;
        boolean sex;
        int age;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
