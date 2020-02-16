package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 32;
    }
    @Override
    public String getDescription(){
        int N = getCountOfEggsPerMonth();
        String Sssss = Country.MOLDOVA;
        return super.getDescription()+" Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";
    }
}