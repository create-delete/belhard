package by.belhard.java18.lessons.lesson5.try3;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter("counter1");
        Counter counter2 = new Counter("counter2");

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println();

        counter1.inc();
        counter1.inc();

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println();

        counter2.inc();

        System.out.println(counter1);
        System.out.println(counter2);
    }
}
