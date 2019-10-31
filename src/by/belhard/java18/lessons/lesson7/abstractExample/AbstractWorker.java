package by.belhard.java18.lessons.lesson7.abstractExample;

public abstract class AbstractWorker {

    private String name;
    private int age;

    public AbstractWorker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat (String dish) {
        System.out.printf("%s is eating %s\n", name, dish);
    }

    public abstract void work();
}
