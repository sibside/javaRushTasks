package com.javarush.task.task20.task2025;

import java.util.*;
import java.util.stream.Collectors;

/*
Алгоритмы-числа
*/
public class Solution {
    //test main method
    public static void main(String[] args) {
        Long[] result = getNumbers(371);

        //printing sorted array of armstrong numbers
        for(long a : result) {
            if(a!=0)
                System.out.println(a);
        }
    }
    //проверяем число на уникальность
    private static boolean isUnique (long x){//153
        long lastDigit = x%10; //3
        long currentDigit;
        x /=10; //15
        while (x>0){
            currentDigit = x % 10; //5
            if(lastDigit>=currentDigit)//3>=5
                return true;
            else if(lastDigit<currentDigit)
                return false;
            lastDigit = currentDigit;
            x /= 10;
        }
        return true;
    }
    //возводим каждую цифру числа в степень = длину числа
    public static long sum(long a){
        long result = 0;
        long d = (""+a).length();
        long b = a%10;
        while (a>=1){
            result += Math.pow(b,d);
            a/=10;
            b=a%10;
        }
        return result;
    }
    //is Armstrong number?
    public static boolean isArm(long x){
        if(sum(x)==x)
            return true;
        else
            return false;
    }

    public static Long[] getNumbers(long N) {
        //mainPart
        List<Long> res = new ArrayList<>();
        for(int i = 0; i<N;i++){
            if(isUnique(i)){
                long sumPow = sum(i);
                if(isArm(sumPow)){
                    res.add(sumPow);
                    System.out.print(sumPow+" ");
                }
            }
        }
        Long[] result = new Long[res.size()];
        for(int i = 0; i<result.length;i++){
          result[i] = res.get(i);
        }
        Set<Long> armstrongNumbers = new TreeSet(Arrays.stream(result).collect(Collectors.toSet()));
        result = armstrongNumbers.stream().toArray(Long[] ::new);

        return result;
    }
}
