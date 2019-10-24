package by.belhard.java18.homeworks.homework4.task2;
/*
Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь:
а) переместиться в новые координаты,
б) вывести на консоль значение текущего положения,
доп1 в*) игрок должен хранить значение пройденного расстояния и уметь вводить на консоль это значение.
 */
public class Gamer {
    int sourseX, sourceY;
    double distance = 0;

    public Gamer(){
        sourseX = 0;
        sourceY = 0;
    }

    public void move (int destinationX, int destinationY){
        distance += coverDistance(destinationX,destinationY);
        sourseX = destinationX;
        sourceY = destinationY;
    }

    private double coverDistance(int x, int y){
        return Math.sqrt(Math.pow((x-sourseX),2) + Math.pow((y-sourceY),2));
    }

    public void showCoordinats(){
        System.out.printf("Вы находитесь в %d по Х и %d по Y\n", sourseX, sourceY);
    }
    public void showDistance(){
        System.out.printf("Вы прошли %.2f\n", distance);
    }

}
