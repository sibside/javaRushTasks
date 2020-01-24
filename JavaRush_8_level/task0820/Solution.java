package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for(int i = 0; i < 4; i++) result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<>();

        for(int i = 0; i < 3; i++) result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> join = new HashSet<>();
        Iterator<Cat> cat = cats.iterator();
        Iterator<Dog> dog = dogs.iterator();
        while (cat.hasNext())
            join.add(cat.next());
        while (dog.hasNext())
            join.add(dog.next());

        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Cat> iteratorCat = cats.iterator();
        while (iteratorCat.hasNext())
            pets.remove(iteratorCat.next());
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }

    //напишите тут ваш код
    public static class Dog {}
    public static class Cat {}
}
