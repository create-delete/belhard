package by.belhard.java18.lessons.lesson10.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread("thread1");
        Thread thread2 = new Thread(new MyRunnableThread("thread2"));
        Thread threadDaemon = new Thread(() -> {
            while (true){
                try {
                    for (; ; ) {
                        System.out.print(".");

                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        threadDaemon.setDaemon(true);

        thread1.start();
        thread2.start();
        threadDaemon.start();

//        thread1.join();
//        thread2.join();

        System.out.println("main thread ends");
    }
}
