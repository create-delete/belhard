package by.belhard.java18.lessons.lesson8.exceptionExample.checked;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/nofile.no");

        try {
            method1(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end of programm");
    }
    private static void method1 (File file) throws IOException {
        OutputStream stream = new FileOutputStream(file);

        stream.write(1);

        System.out.println("end of method1");
    }
}
