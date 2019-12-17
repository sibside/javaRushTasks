package com.javarush.task.task14.task1408;


public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){ return 40; }
    @Override
    String getDescription(){
        int N = getCountOfEggsPerMonth();
        String Sssss = Country.BELARUS;
        return super.getDescription()+" Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";
    }
}
