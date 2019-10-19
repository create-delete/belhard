package by.belhard.java18.homeworks.homework3;

/*
Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum, процент годовых proc, количество лет years, на которые совершается вклад.
Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
????????????????????????????????Вывести, сколько денег будет на счету после years лет.
????????????????????????????????*доп. Каждый год банк вычитает из суммы вклада налог в сумме 1% от изначального вклада.

 */
public class Task4 {
    public static void main(String[] args) {
        int startSum = 100, years = 5;
        double proc = 3.3;
        double deposit = startSum;
        for (int i = 0; i < years; i++) {
            deposit += deposit / 100 * proc;
        }
        //****************************************
        deposit = startSum;
        for (int i = 0; i < years; i++) {
            deposit += deposit / 100 * proc;
            deposit -= startSum / 100;
        }
        // Может от вклада на начало года??
        deposit = startSum;
        for (int i = 0; i < years; i++) {
            deposit -= startSum / 100;
            deposit += deposit / 100 * proc;
        }
    }
}
