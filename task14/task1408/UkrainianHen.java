package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 35;
    }
    @Override
    public String getDescription(){
        int N = getCountOfEggsPerMonth();
        String Sssss = Country.UKRAINE;
        return super.getDescription()+" Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";
    }
}
