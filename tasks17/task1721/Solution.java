package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        //read from First file
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(firstFileName), StandardCharsets.UTF_8));
        String line;
        while((line = reader.readLine()) != null){
            allLines.add(line);
        }

        //read from Second file
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(secondFileName), StandardCharsets.UTF_8));
        while ((line = reader.readLine()) != null){
            forRemoveLines.add(line);
        }

        try{
            new Solution().joinData();
        }catch (CorruptedDataException e){
            System.out.println("AllLines list not contains all lines from second list.");
        }
    }

    public void joinData() throws CorruptedDataException {
        boolean removeFromAllLines = false;
        for(int i = 0; i < forRemoveLines.size(); i++){
            if(allLines.contains(forRemoveLines.get(i)))
                removeFromAllLines = true;
            else{
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
        if(removeFromAllLines == true){
            for(int i = 0; i < allLines.size(); i++){
                if(forRemoveLines.contains(allLines.get(i)))
                    allLines.remove(i);
            }
        }
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
