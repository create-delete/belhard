package by.belhard.java18.lessons.lesson10.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people =  Arrays.asList(
                new Person("person1", 20),
                new Person("person2", 21),
                new Person("person3", 26),
                new Person("person4", 21),
                new Person("person5", 29),
                new Person("person6", 20),
                new Person("person7", 240),
                new Person("person8", 24),
                new Person("person9", 31),
                new Person("person10", 14)
        );

        List<Person> collct = people.stream()
                .filter(p -> p.getAge()>25)
                .sorted((p1, p2) -> p2.getAge()-p1.getAge())
                .collect(Collectors.toList());

        System.out.println(collct);
    }
}
