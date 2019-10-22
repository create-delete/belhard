package by.belhard.java18.homeworks.homework3;

/*
аны 2 числа, a – целое, n – целое положительное. Используя цикл, найти результат возведения a в степень n.
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 2, n = 2, result;
        if (n >= 2) {
            result = a * a;
            for (int i = 0; i < n - 2; i++) result *= a;
        } else if (n == 1) {
            result = a;
        } else result = 1;

        ////////////////////////////////////////////////////////////////////////////////////////////
        int a1 = 2, n1 = 4, result1 = 0;
        switch (n1) {
            case 0:
                result1 = 1;
                break;
            case 1:
                result1 = a1;
                break;
            default:
                result1 = a1 * a1;
                for (int i = 0; i < n1 - 2; i++) result1 *= a1;
        }
        ///////////////////////////////////////////////////А чего степерь должна быть double?
        int a2 = 2, n2 = 6;
        double result3 = Math.pow((double) a2, (double) n2);
    }
}
