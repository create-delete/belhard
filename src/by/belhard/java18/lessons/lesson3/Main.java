package by.belhard.java18.lessons.lesson3;

// 1. Arrays

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                        // В БУДУЩЕМ НАДО НА КАЖДУЮ ПОДТЕМУ СОЗДАВАТЬ ОТДЕЛЬНЫЙ КЛАСС - ТАК УДОБНЕЕ
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //arrays //////////////////////////////////////////////////////////////////////////

        int[] array1 = {5, 6, 8, -10, 11};

        System.out.println(array1[3]);

        array1[0] = 100;
        System.out.println(array1[0]);

        int[] array2 = new int[3];
        System.out.println(array2[0]);

        boolean[] bool = new boolean[2];
        System.out.println(bool[1]);

        char[] c = new char[2];
        System.out.println("start" + c[1] + "end");

        double[] d = new double[2];
        System.out.println(d[1]);

        int[][] arrayD = new int[3][];
        System.out.println(arrayD[1]);
        // System.out.println(arrayD[1][0]); null
        arrayD[0] = new int[3];
        System.out.println(arrayD[0].length);
        arrayD[0][0] = 1;
        arrayD[0][1] = 1;
        arrayD[0][2] = 1;
        arrayD[1] = new int[3];
        arrayD[0] = new int[4];
        for (int i : arrayD[0]) {
            System.out.println(i);
        }
        System.out.println(arrayD[0]);

        // TYPES///////////////////////////////////////////////////////

        int a = 97;
        char ch = (char) a;
        System.out.println(ch);

        //LOOPS //////////////////////////////////////////////////////////////////////////////////////////////

        String str = (a >= 98) ? (a < 97) ? "1" : " 2" : "3";
        System.out.println(str);
        int iforWhile = 0;

        do {
            System.out.println(iforWhile);
            iforWhile++;
        } while (iforWhile != 3);
        /*for (String s = ""; s != "111"; s += "1") { // Бесконечный цикл. А почему на 3-ей итерации строка "111" != "111" не завершает цикл ?
            System.out.println(s);
        }*/

        int[][] arrayD2 = new int[][]{{1, 2, 3,}, {43, 5, 1}};

        for(int i = 0; i < arrayD2.length; i++) {
            for (int k = 0; k < arrayD2[i].length; k++) {
                System.out.print(arrayD2[i][k] + " ");
            }
            System.out.println();
        }

        for(int[] ar : arrayD2) {
            for(int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
