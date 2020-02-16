package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        try {
            Thread.sleep(3500);
            if(!clock.isInterrupted())
                clock.interrupt();

        }catch (InterruptedException e){}
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            for(; numSeconds > 0; numSeconds--){
                try {
                    Thread.sleep(1000);
                    System.out.print(numSeconds+" ");
                    if((numSeconds-1) == 0)
                        System.out.print("Марш!");
                    }
                catch (InterruptedException e){
                    System.out.print(numSeconds+" ");
                    System.out.print("Прервано!");
                    }
                }
            }
    }
}
