package by.belhard.java18.lessons.lesson6.inheritance;

public class EqualityExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 20, 200);
        Person person2 = new Person("Ivan", 20, 100);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));


    }
}
