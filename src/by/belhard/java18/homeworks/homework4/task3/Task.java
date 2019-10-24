package by.belhard.java18.homeworks.homework4.task3;

public class Task {
    SystemAdmin assigned;

    public Task(SystemAdmin slave){
            assigned = slave;
    }

    public static Task GetTask(SystemAdmin systemAdmin){
        return new Task(systemAdmin);
    }

}
