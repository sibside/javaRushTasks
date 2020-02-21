package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream original;

    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException {
        super(fileName);
        this.original = outputStream;
    }

    public void flush() throws IOException{original.flush();}

    public void write(int b) throws IOException{original.write(b);}

    public void write(byte[] b) throws IOException{original.write(b);}

    public void write(byte[] b, int off, int len) throws IOException{original.write(b,off,len);}

    public void close() throws IOException{
        flush();
        String javaRush = "JavaRush © All rights reserved.";
        original.write(javaRush.getBytes());
        original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
