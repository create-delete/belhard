package by.belhard.java18.lessons.lesson10.threads;

public class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
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
