package by.belhard.java18.homeworks.homework8.task1;

import java.util.ArrayList;

/*
1) Есть список строк. Создать метод, принимающий список строк и возвращающий одну строку, состоящую из элементов списка, длина которых менее 5 символов, через пробел.
Пример: список строк ArrayList<String> {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Результат: “aaa bbb  . ccc”.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("ok");
        list.add("asdasd");
        list.add("asda");
        list.add("karamba");
        System.out.println(getShorterThenFive(list));
    }

    public static String getShorterThenFive(ArrayList<String> list) {

        String result = "";

        for(String s : list ) {
            if(s.length() < 5) result += (s + " ");
        }

        return result;
    }
}
