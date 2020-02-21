package com.javarush.task.task18.task1823;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while (!(line = reader.readLine()).equals("exit")){
            ReadThread thread = new ReadThread(line);
            thread.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                NavigableMap<Integer, Byte> map = new TreeMap<>();

                FileInputStream inputStream = new FileInputStream(fileName);
                byte[] buff = new byte[inputStream.available()];
                inputStream.read(buff);

                for(int i = 0; i < buff.length; i++){
                    int count = 1;
                    for(int j = 0; j < i; j++){
                        if(buff[i]==buff[j])
                            count++;
                    }
                    map.put(count,buff[i]);
                }
                inputStream.close();
                Map.Entry<Integer,Byte> entry = map.lastEntry();
                resultMap.put(fileName,(int)entry.getValue());
            } catch (IOException e) {}
        }
    }
}
