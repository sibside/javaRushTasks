package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        //пишем в файл
        if(args.length>0){
            //добавляем файл в ArrayList
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String data;
            List<String> arrList = new ArrayList<>();
            while ((data = reader.readLine())!=null) {
                arrList.add(data);
            }

            if(args[0].equals("-u")) {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8));
                writer.newLine();
                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), StandardCharsets.UTF_8));
                for(int i = 0; i < arrList.size();i++) {
                    //парсим каждый ID
                    String tmp="";
                    for (int j = 0; j < 8; j++){
                        tmp = tmp+arrList.get(i).charAt(j);
                    }
                    String[] buff = tmp.split(" ");
                    //если мы нашли нужны нам ай-ди
                    if((Integer.parseInt(buff[0])==Integer.parseInt(args[1]))){
                        if(i==0){
                            String line = String.format("%n%-8s%-30s%-8s%-4s",Integer.parseInt(args[1]),args[2],args[3],args[4]);
                            writer.write(line);
                        }
                        else if (i>0){
                            String line = String.format("%n%-8s%-30s%-8s%-4s",Integer.parseInt(args[1]),args[2],args[3],args[4]);
                            writer.write(line);
                        }
                    }
                    else {
                        if(i==0)
                            writer.write(arrList.get(i));
                        else if (i>0){
                            writer.newLine();
                            writer.write(arrList.get(i));
                        }
                    }
                }
                writer.close();
                reader.close();
            }
            else if (args[0].equals("-d")){
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8));
                writer.newLine();
                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), StandardCharsets.UTF_8));
                for(int i = 0; i < arrList.size();i++) {
                    //парсим каждый ID
                    String tmp="";
                    for (int j = 0; j < 8; j++){
                        tmp = tmp+arrList.get(i).charAt(j);
                    }
                    String[] buff = tmp.split(" ");
                    //пишем если айди не равен
                    if((Integer.parseInt(buff[0])!=Integer.parseInt(args[1]))){
                        if(i==0)
                            writer.write(arrList.get(i));
                        else if (i>0){
                            writer.newLine();
                            writer.write(arrList.get(i));
                        }
                    }
                }
                writer.close();
                reader.close();
            }
        }
    }
}
