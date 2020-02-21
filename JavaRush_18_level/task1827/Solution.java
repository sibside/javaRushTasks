package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        //ищем максимальный id
        String data;
        int id = 0;
        while ((data = reader.readLine())!=null){
             String tmp="";
             for (int i = 0; i < 8; i++){
                 tmp = tmp+data.charAt(i);
             }
            String[] buff = tmp.split(" ");
            if((Integer.parseInt(buff[0])>id))
                id = Integer.parseInt(buff[0]);
        }
        reader.close();
        //генерируем id -> переводим в String 8 byte
        id += 1;
        data = String.valueOf(id);
        if(data.length() < 8){
            for (int i = data.length(); i < 8;i++)
                data = data+" ";
        }
        //пишем в файл
        if(args.length!=0){
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), StandardCharsets.UTF_8));
            String line = String.format("%n%-8s%-30s%-8s%-4s",id,args[1],args[2],args[3]);
            writer.write(line);
            writer.close();
        }
    }
}
