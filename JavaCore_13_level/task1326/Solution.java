package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        File file = new File(fileName);
        InputStream fileInputStream = new FileInputStream(file);

        ArrayList<Integer> arr = new ArrayList<>();

        while (fileInputStream.available()>0){
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()){
                int a = scanner.nextInt();
                if(a%2==0)
                    arr.add(a);
            }
        }
        Collections.sort(arr);
        arr.forEach(System.out::println);
        fileInputStream.close();
        }
    }


