package com.javarush.task.task15.task1527;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String obj ="";
        Boolean OBJ = false;
        if(str.contains("obj"))
            OBJ = true;
        //отсекаем все что после ?
        String[] strMass = str.split("\\?");
        str = strMass[1];

        //разделяем на &
        strMass = str.split("&");

        //разделяем на = (limit: 1)
        for(int i = 0; i < strMass.length; i++){
            if(strMass[i].contains("obj")){
                String[] tmp = strMass[i].split("=");
                arrayList.add(tmp[0]);
                obj = tmp[1];
            }
            else {
                String[] strEbatoria = strMass[i].split("=", -1);
                arrayList.add(strEbatoria[0]);
            }
        }
        for(int i = 0; i < arrayList.size(); i++){
            if(i != arrayList.size()-1)
                System.out.print(arrayList.get(i) + " ");
            else
                System.out.print(arrayList.get(i));
        }
        if(OBJ == true){
            System.out.println();
            try{
              alert(Double.parseDouble(obj));
            }catch (Exception e){
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
