package by.belhard.java18.lessons.lesson7.interfaceExample;

public interface Workable {
    int defaultAge = 5;
    void work();

    default void defaultMethod(String param) {
        System.out.println("param: " + param);
    }
}
