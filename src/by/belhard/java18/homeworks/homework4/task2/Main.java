package by.belhard.java18.homeworks.homework4.task2;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.showCoordinats();
        player.showDistance();
        player.move(2,3);
        player.showCoordinats();
        player.showDistance();
        player.move(1,2);
        player.showCoordinats();
        player.showDistance();
        player.move(5,-3);
        player.showCoordinats();
        player.showDistance();
    }
}
