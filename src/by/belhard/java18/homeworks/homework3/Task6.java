package by.belhard.java18.homeworks.homework3;

import java.util.Arrays;

/*
Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.
*доп. Посчитать и вывести медиану.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 5, 3, 1};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма: " + sum + ". Среднее значение: " + (double) sum / array.length);

        //********median

        for (int i = array.length - 1; i > 0; i--) {
            for (int q = 0; q < i; q++) {
                if (array[q] > array[i]) {
                    int temp = array[q];
                    array[q] = array[i];
                    array[i] = temp;
                }
            }
        }
        if (array.length % 2 == 0) {
            System.out.println("median: " + (double)(array[array.length / 2] + array[array.length / 2 + 1])/2);
        } else System.out.println("median: " + array[array.length / 2]);
    }
}
