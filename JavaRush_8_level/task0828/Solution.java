package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        ArrayList<String> arr = new ArrayList<>();
        arr.add("January"); arr.add("February"); arr.add("March");
        arr.add("April"); arr.add("May"); arr.add("June");
        arr.add("July"); arr.add("August"); arr.add("September");
        arr.add("October"); arr.add("November"); arr.add("December");

        for(int i = arr.size()-1; i>=0;i--){
            if (month.equals(arr.get(i)))
                System.out.println(month+" is the "+(i+1)+" month");
        }
    }
}
