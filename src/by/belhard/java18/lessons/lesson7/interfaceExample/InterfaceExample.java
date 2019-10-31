package by.belhard.java18.lessons.lesson7.interfaceExample;

import java.util.HashMap;

public class InterfaceExample {
    public static void main(String[] args) {

        Workable worker = new Worker();
        worker.work();
        worker.defaultMethod("katletki");
        worker =  new Machine();
        worker.work();
        worker.defaultMethod("katletki");
        HashMap map;
    }
}
