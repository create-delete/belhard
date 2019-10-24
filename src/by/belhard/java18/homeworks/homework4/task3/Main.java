package by.belhard.java18.homeworks.homework4.task3;
//ОПИСАТЬ КЛАСС CTO
public class Main {
    public static void main(String[] args) {
        CTO boss = new CTO("Мухин Роман Игоревич", false, 0);
        SystemAdmin slave = new SystemAdmin();

        boss.scheduledTask(slave);
        boss.isDzen();

        for(int i = 0; i<101; i++){
            boss.drinkBear();
        }

        boss.isDzen();
    }
}
