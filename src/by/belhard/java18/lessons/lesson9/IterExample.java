package by.belhard.java18.lessons.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {{
                    add("one");
                    add("two");
                    add("three");
                    add("four");
                    add("five");
        }};

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("three"))
                iterator.remove();
            continue;
        }

        System.out.println(list);
    }
}
