package by.belhard.java18.lessons.lesson7.interfaceExample;

public class Worker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Work hard");
    }

    @Override
    public void eat(String dish) {
        System.out.println("Eat " + dish);
    }

}
