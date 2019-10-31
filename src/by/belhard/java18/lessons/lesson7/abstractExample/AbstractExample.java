package by.belhard.java18.lessons.lesson7.abstractExample;

public class AbstractExample {
    public static void main(String[] args) {
        AbstractWorker worker = new FactoryWorker("Vasya", 20);

        workingDay(worker);

        worker = new OfficeWorker("Danya", 30);

        workingDay(worker);
    }

    public static void workingDay(AbstractWorker worker) {
        worker.work();
        worker.eat("fish");
        worker.work();
    }
}
