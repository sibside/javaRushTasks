package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;


public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()))) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = readerFile.readLine()) != null) {
                    sb.append(line);
                }

                Document doc = Jsoup.parse(sb.toString(), "", Parser.xmlParser());
                Elements elements = doc.getElementsByTag(args[0]);
                for (Element el : elements) {
                    System.out.println(el.toString());
                }
            }
        } catch (IOException e) {
        }
    }
}
