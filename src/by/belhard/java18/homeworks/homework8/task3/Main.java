package by.belhard.java18.homeworks.homework8.task3;

import java.util.Map;
import java.util.TreeMap;

/*
Создать метод, который принимает строку и возвращает Map<Character, Integer> - количество каждого символа, который встречается в строке. Вывести на консоль.
* считать большие и маленькие буквы одинаковыми. Считать знаки препинания не отдельно каждый, а общее количество ".,!-:?".
 */
public class Main {

    public static void main(String[] args) {
        //Map<Character, Integer> map = symbolsByString("Мухин Роман Игоревич. Домашнее задание выполнил.");
        Map<Character, Integer> map = symbolsByStringIgnoreCase("!Мама? мыла, раму.");

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

    /*private static Map<Character, Integer> symbolsByString(String mainString) {
        Map<Character, Integer> map = new TreeMap<>();

        char[] chArrByStr = mainString.toCharArray();

        for (char c : chArrByStr) {
            if (!map.containsKey(c)) {
                int qty = 0;
                for (char ch : chArrByStr) {
                    if (c == ch) qty++;
                }
                map.put(c, qty);
            }
        }

        return map;
    }*/

    private static Map<Character, Integer> symbolsByStringIgnoreCase(String mainString) {
        Map<Character, Integer> map = new TreeMap<>();

        mainString = mainString.toLowerCase();

        char[] punctuation = {'?', ',', '.', '-', ':'};

        for (char c : punctuation) {
            mainString = mainString.replace(c, '!');
        }

        char[] chArrByStr = mainString.toCharArray();

        for (char c : chArrByStr) {

            if (!map.containsKey(c)) {
                int qty = 0;

                for (char ch : chArrByStr) {
                    if (c == ch) qty++;
                }
                map.put(c, qty);
            }
        }
        return map;
    }
}
