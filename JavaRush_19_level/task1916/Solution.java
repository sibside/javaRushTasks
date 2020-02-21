package com.javarush.task.task19.task1916;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        //reader for reading file name
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //readers for reading files
        BufferedReader readerFile1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader readerFile2 = new BufferedReader(new FileReader(reader.readLine()));

        //close reader
        reader.close();

        //2 String variables
        String oldFile, editFile;

        //2 ArrayLists
        ArrayList<String> Old = new ArrayList<>();
        ArrayList<String> Edit = new ArrayList<>();

        //loops for file reading
        while ((oldFile = readerFile1.readLine())!=null){
            Old.add(oldFile);
        }
        while ((editFile = readerFile2.readLine())!=null){
            Edit.add(editFile);
        }
        //close 1 and 2 file reader
        readerFile1.close();
        readerFile2.close();

        //variables for main LOOP
        int finish = 0;
        if(Old.size()>Edit.size())
            finish = Old.size();
        else if (Old.size()<Edit.size())
            finish = Edit.size();
        else if (Old.size()==Edit.size())
            finish = Edit.size();
        int i1 = 0;
        int i2 = 0;
        while (finish!=0){
            try{
                if(Old.get(i1).equals(Edit.get(i2))) {
                    lines.add(new LineItem(Type.SAME, Old.get(i1)));
                    i1++;
                    i2++;
                    finish--;
                    try {
                        if(Edit.size()<Old.size() & !(Old.get(i1+1).equals(Edit.get(i2))))
                            Edit.get(i2 + 1);
                    }catch (IndexOutOfBoundsException y){
                        lines.add(new LineItem(Type.ADDED, Edit.get(i2)));
                    }
                }
                else if(!(Old.get(i1).equals(Edit.get(i2))) & (Old.get(i1+1).equals(Edit.get(i2)) )){
                    lines.add(new LineItem(Type.REMOVED, Old.get(i1)));
                    i1++;
                }
                else if(!(Old.get(i1).equals(Edit.get(i2)))){
                    lines.add(new LineItem(Type.ADDED, Edit.get(i2)));i2++;
                }
            }catch (IndexOutOfBoundsException e){
                if(Old.size()<Edit.size()){
                    lines.add(new LineItem(Type.ADDED, Edit.get(Edit.size()-1)));
                    i2++;
                    for(int i = i2; i<Edit.size();i++)
                        lines.add(new LineItem(Type.ADDED, Edit.get(i)));
                    finish = 0;
                }
                else if(Old.size()>Edit.size()){
                    try{
                    lines.add(new LineItem(Type.REMOVED, Old.get(i1)));
                    }catch (IndexOutOfBoundsException e1){
                        break;
                    }
                    ++i1;
                    for(int i = i1; i<Old.size()-1;i++)
                        lines.add(new LineItem(Type.REMOVED, Old.get(i)));
                    finish = 0;
                }
            }
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}