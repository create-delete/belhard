package by.belhard.java18.homeworks.homework3;

/*
Дано: «треугольный» массив, то есть двумерный массив, в котором в нулевой ячейке содержится массив с 1 ячейкой, во первой – с двумя, во второй – с тремя и т.д.
Целое число startInt.
Заполнить массив таким образом, чтобы каждый следующий элемент был в 2 раза больше предыдущего, и вывести его на консоль.
Пример вывода с startInt = 1 и массивом размерностью 4:

*доп. Заполнять не «слева-направо», а «справа-налево»:
 */
public class Task8 {
    public static void main(String[] args) {

        int[][] array = new int[4][];
        int startInt  = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(i + 1)];
        }
        for (int i = 0; i < array.length; i++) {
            for (int q = 0; q < array[i].length; q++) {
                array[i][q] = startInt ;
                startInt  *= 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int q = 0; q < array[i].length; q++) {
                System.out.print(array[i][q] + "\t");
            }
            System.out.println();
        }

        ///////*****************************************************

        for (int i = 0; i < array.length; i++) {
            for (int q = array[i].length-1; q >= 0; q--) {
                System.out.print(array[i][q] + "\t");
            }
            System.out.println();
        }
    }
}