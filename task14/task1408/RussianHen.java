package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 30;
    }
    @Override
    public String getDescription(){
        int N = getCountOfEggsPerMonth();
        String Sssss = Country.RUSSIA;
        return super.getDescription()+" Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";
    }
}