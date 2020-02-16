package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        class Thread1 extends Thread {
            public void run(){
                while (true){}
            }
        }
        class Thread2 extends Thread {
            public void run(){
                if(Thread.currentThread().isInterrupted())
                    System.out.println("InterruptedException");
            }
        }
        class Thread3 extends Thread {
            public void run(){
                try {
                    while (true){
                        System.out.println("Ура");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                }
            }
        }
        class Thread4 extends Thread implements Message {
            public void run(){
                while (!isInterrupted()){}
            }
            @Override
            public void showWarning(){
                this.interrupt();
            }
        }
        class Thread5 extends Thread {
            public void run(){
                try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                    int sum = 0;
                    while (true){
                        String str = reader.readLine();
                        if(str.equals("N"))
                            break;
                        sum = sum + Integer.parseInt(str);
                    }
                    System.out.println(sum);
                }catch (IOException e){}
            }
        }
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
    }
}