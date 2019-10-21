package by.belhard.java18.homeworks.homework3;

/*
Вывести на консоль таблицу умножения, как сумеете.
 */
public class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int q = 1; q < 10; q++) {
                if (i * q != 1) System.out.print(i * q + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
