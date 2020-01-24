package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<String, Integer> map = new TreeMap<>(Collator.getInstance(new Locale("ru")));
        for (int i = 0; i < alphabet.size(); i++){ // цикл для каждой буквы
            int count = 0; // счетчик букв
            for (int j = 0; j < list.size(); j++){ // цикл для каждой строки из list
                for (int k = 0; k < list.get(j).length(); k++){
                    char x = list.get(j).charAt(k);
                    if (x == alphabet.get(i))
                        map.put(String.valueOf(alphabet.get(i)), ++count);
                }
                if(count == 0)
                    map.put(String.valueOf(alphabet.get(i)), count);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
