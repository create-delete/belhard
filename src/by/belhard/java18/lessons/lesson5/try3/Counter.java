package by.belhard.java18.lessons.lesson5.try3;

public class Counter {

    private static int counter = 0;
    private String str;

    public Counter(String str) {
        counter = -5;
        this.str = str;
    }

    public static int getCounter(){
        return counter;
    }

    public void inc(){
        counter++;
    }

    @Override
    public String toString() {
        return "Counter " + str + " " + counter;
    }
}
