package by.belhard.java18.lessons.lesson10.threads2;

public class MyThreadCounter implements Runnable {

    private final Counter counter;

    public MyThreadCounter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {

            synchronized (counter) {
                counter.inc();
            }
        }
        System.out.println(counter.getA());

    }
}
