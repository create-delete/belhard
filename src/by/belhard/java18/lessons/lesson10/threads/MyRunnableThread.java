package by.belhard.java18.lessons.lesson10.threads;

public class MyRunnableThread implements Runnable {

    private final String name;

    public MyRunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
