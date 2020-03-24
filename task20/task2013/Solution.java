package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(){}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        public void setFirstName(String firstName) { this.firstName = firstName; }

        public void setLastName(String lastName) { this.lastName = lastName; }

        public void setAge(int age) { this.age = age; }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(children);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            setMother((Person) in.readObject());
            setFather((Person) in.readObject());
            setChildren((List)in.readObject());
            setFirstName((String)in.readObject());
            setLastName((String)in.readObject());
            setAge(in.readInt());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    }
}
