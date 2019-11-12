package by.belhard.java18.homeworks.homework8.task4;

import java.util.HashMap;
import java.util.Map;

/*
4) Добрый парень Василий живет в общаге и решил сходить в магазин. Он собирает у желающих список продуктов, которые им нужны, чтобы купить все разом.
Задание: Реализовать класс СписокПокупок, в котором должны содержаться данные о том, кто и какие продукты заказал у Василия.
(Подсказка, здесь подойдет конструкция вида Map<String, List<String>>, где ключами будут имена людей, а значениями - списки из названий продуктов, которые они заказали)
Класс должен содержать метод добавления нового заказа и метод, который выводит на консоль количество каждого продукта во всем списке покупок, например:
bread: 4
butter: 2
pelmeni: 5
beer: 25
 */
public class Main {
    public static void main(String[] args) {

        ShoppingList list = new ShoppingList();

        Map<String, Integer> shopList = new HashMap<>();


        shopList.put("Kolbaska", 1);
        shopList.put("Ogurchiki", 2);
        shopList.put("Maionez", 1);


        list.addBuyer(new Buyer("Роман"), shopList);

        System.out.println(list.getShoppingList());

        list.switchPurchaseByPerson("Роман", "Ogurchiki", 1);

        System.out.println(list.getShoppingList());
    }
}
