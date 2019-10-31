package by.belhard.java18.lessons.lesson7.interfaceExample;

public class Machine implements Workable {
    @Override
    public void defaultMethod(String param) {
        System.out.println("NO PARAM USAGE!!! Machine default");
    }

    @Override
    public void work() {
        System.out.println("Work like a machine");

    }
}
