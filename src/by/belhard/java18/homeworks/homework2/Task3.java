package by.belhard.java18.homeworks.homework2;

/*Есть вещественные(дробные) переменные rad, rX и rY.
Они хранят радиус и координаты центра окружности.
Есть вещественные переменные dX и dY. Они хранят координаты точки.
Посчитать и вывести сообщения «За пределами», «На окружности» или «Внутри» в случаях если, соответственно, точка находится вне окружности, на окружности или внутри окружности.
Подсказка: для этого нужно посчитать расстояние между центром окружности и точкой и сравнить это расстояние с радиусом.
Расстояние между точками на координатной плоскости считаем по теореме Пифагора.*/

public class Task3 {
    public static void main(String[] args) {
        double rad = 1.4, rX = 2, rY = 1;
        double dX = 1, dY = 2;

        double distanceX = dX - rX, distanceY = dY - rY;
        if(distanceX < 0) distanceX = -distanceX;
        if(distanceY < 0) distanceY = -distanceY;

        double distance = Math.sqrt(distanceX*distanceX + distanceY*distanceY);

        if(distance>rad) System.out.println("За пределами");
        else if(distance == rad) System.out.println("На окружности");
        else System.out.println("Внутри");
    }
}
