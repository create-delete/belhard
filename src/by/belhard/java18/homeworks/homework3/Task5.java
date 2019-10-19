package by.belhard.java18.homeworks.homework3;

/*
Вывести в строку через пробел все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7 одновременно.
*доп1. Вывести в строку через пробел все числа от 1 до 100, которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7.
*доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.
 */
public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) System.out.print(i + " ");
        }
        System.out.println();
        //****************************************************************
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i % 7 == 0) {
                } else System.out.print(i + " ");
                continue;
            }
            if (i % 7 == 0) System.out.print(i + " ");
        }

        System.out.println();
        //*****************************************************************

        int iForSwitch = 0;
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    iForSwitch = 1;
                    break;
                case 1:
                    iForSwitch = 3;
                    break;
                case 2:
                    iForSwitch = 5;
                    break;
                case 3:
                    iForSwitch = 7;
                    break;
                case 4:
                    iForSwitch = 9;
                    break;
            }
            int k = iForSwitch * 10;
            for (int count = 0; count < 10; count++) {
                if ((k + count) % 5 == 0) {
                    if ((k + count) % 7 == 0) {
                    } else System.out.print((k + count)+ " ");
                    continue;
                }
                if ((k + count) % 7 == 0) System.out.print((k + count) + " ");
            }
        }
    }
}
