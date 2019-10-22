package by.belhard.java18.homeworks.homework3;
/*
Даны зарплаты трех людей. Найти разницу между максимальной и минимальной зарплатой.
Попробуйте решить без использования класса Math.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] salary = {10, 20, 30};
        int min = salary[0], max = salary[0];
        for (int i : salary) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println(max - min);

        ///////////// without array/////////////////
        int salary1 = 10, salary2 = 210, salary3 = 30;

        int minSalary = salary1 < salary2 ? salary1 : salary2;
        minSalary = minSalary < salary3 ? minSalary : salary3;

        int maxSalary = salary1 > salary2 ? salary1 : salary2;
        maxSalary = maxSalary > salary3 ? maxSalary : salary3;

        System.out.println(maxSalary - minSalary);
    }
}
