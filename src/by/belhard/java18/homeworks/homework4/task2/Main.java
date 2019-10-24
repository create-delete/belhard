package by.belhard.java18.homeworks.homework4.task2;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        gamer.showCoordinats();
        gamer.showDistance();
        gamer.move(2,3);
        gamer.showCoordinats();
        gamer.showDistance();
        gamer.move(1,2);
        gamer.showCoordinats();
        gamer.showDistance();
        gamer.move(5,-3);
        gamer.showCoordinats();
        gamer.showDistance();
    }
}
