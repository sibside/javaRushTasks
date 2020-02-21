package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        NavigableMap<String, String> map = new TreeMap<>();
        //читаем пути к файлам
        while (!(line = reader.readLine()).equals("end")){
            map.put(line, line);
        }
        //создаем файл для записи
        Map.Entry<String, String> pair = map.lastEntry();
        line = pair.getKey();
        String[] pathFile = line.split("\\.part");
        File newFile = new File(pathFile[0]);
        newFile.createNewFile();
        //читаем и пишем в файла
        FileWriter writer = new FileWriter(newFile, true);
        for(Map.Entry<String,String> mapPair : map.entrySet()){
           reader = new BufferedReader(new FileReader(mapPair.getValue()));
           writer.write(reader.readLine());
           reader.close();
        }
        writer.close();
        reader.close();
    }
}
