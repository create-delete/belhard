package by.belhard.java18.homeworks.homework8.task2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name;
    }
}
