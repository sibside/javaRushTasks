package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface original;

        public TableInterfaceWrapper (TableInterface tableInterface){
            this.original = tableInterface;
        }

        public void setModel(List rows){
            original.setModel(rows);
            System.out.println(rows.size());
        }

        public String getHeaderText(){
            return original.getHeaderText().toUpperCase();
        }

        public void setHeaderText(String newHeaderText){
            original.setHeaderText(newHeaderText);
        }

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}