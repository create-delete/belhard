package by.belhard.java18.lessons.lesson2.homework;
/*Создать переменную r целого типа.
  Присвоить ей какое-то значение. r – радиус окружности.
  Вывести на экран площадь круга и длину окружности, либо – сообщение «Некорректный ввод!» в случае, если r – отрицательное или равно нулю.*/
public class Task2 {
    public static void main(String[] args) {
        int r = 3;
        if (r > 0) {
            System.out.println(3.14 * (r*r));
        }
        else {
            System.out.println("Некорректный ввод!");
        }
    }
}
