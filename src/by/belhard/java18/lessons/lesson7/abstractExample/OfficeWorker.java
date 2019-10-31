package by.belhard.java18.lessons.lesson7.abstractExample;

public class OfficeWorker extends AbstractWorker {

    public OfficeWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Office worker don't work");
    }
}
