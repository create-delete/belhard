package by.belhard.java18.lessons.lesson7;

public class EqualsHashodeExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan");
        Person person2 = new Person(2, "Vasiliy");
        Person person3 = new Person(1, "Ivan");

        System.out.println("person1 " + person1.hashCode());
        System.out.println("person2 " + person2.hashCode());
        System.out.println("person3 " + person3.hashCode());
    }
}
