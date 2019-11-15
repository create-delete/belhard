package by.belhard.java18.homeworks.homework9.task2;
/*
принять с консоли число.
Это число будет являться количеством следующих строк, которые нужно считать с консоли.
Каждая строка должна содержать название товара, цену за штуку (вещественное число), количество штук, разделенные пробелом.
После ввода последнего товара вывести на консоль общую стоимость всех введенных товаров.
 */

public class Main {
    public static void main(String[] args)  {

        BuyerList buyerList = new BuyerList();

        buyerList.setInputStrings();

        buyerList.printTotalPrice();
    }
}
