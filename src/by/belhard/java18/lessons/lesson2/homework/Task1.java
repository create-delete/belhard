package by.belhard.java18.lessons.lesson2.homework;
/*Создать по одной переменной каждого примитивного типа, присвоить им значения.
Попробовать совершить какие-либо действия над ними (арифметические, логические, сравнения). Вывести на экран результаты этих действий.
Например:
int i = 158;
System.out.println(i * 30 % 24); // должно вывести 12
System.out.println(i >= 100); // должно вывести true*/
public class Task1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.5f;
        double d = 6.6;
        boolean isBool = false;
        char c = 'a';
        System.out.println(b+s);
        System.out.println(s-i);
        System.out.println(i/l);
        System.out.println(l%f);
        System.out.println(d++ + ++d); // 6.6 + 7.6 = 14.2 Почему ответ 15.2 ?
        System.out.println(d++);
        System.out.println(++d);
        System.out.println(c/c);
        System.out.println(isBool && b+s==i);
    }
}
