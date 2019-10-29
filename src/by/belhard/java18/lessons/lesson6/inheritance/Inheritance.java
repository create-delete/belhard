package by.belhard.java18.lessons.lesson6.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Person person = new Person("Roman", 29, 190.2);
        Worker worker = new Worker("Polina", 28, 40, 500);
        worker.work();
        worker.eat("Fish");
        worker.growOld();
        person.growOld();
        System.out.println(person);
        System.out.println(worker);

        Person worker2 = new Worker("Roman", 29, 190.2,300);

        System.out.println(worker2.growOld());
        System.out.println(((Person)worker2).growOld());
    }
}
