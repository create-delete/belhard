package by.belhard.java18.homeworks.homework5.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CaseForClothes cfs = new CaseForClothes(3);
        cfs.audit();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(2));
        }

    }
}
