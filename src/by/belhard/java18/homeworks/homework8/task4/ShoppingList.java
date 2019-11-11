package by.belhard.java18.homeworks.homework8.task4;

import by.belhard.java18.homeworks.homework8.task2.Person;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    private Map<Person, Map<String, Integer>> shoppingList;

    public ShoppingList(){
        shoppingList = new HashMap<>();
    }

    public Map<Person, Map<String, Integer>> getShoppingList() {
        return shoppingList;
    }

    public void addBuyer (Person person, Map<String, Integer> shopList) {

        shoppingList.put(person, shopList);
    }

    public void switchPurchaseByPerson (String name, Map<String, Integer> shopList){
        boolean flaq = false;

        //Проверяю есть ли такой человек в списке
        for(Map.Entry<Person, Map<String, Integer>> pair : shoppingList.entrySet()){

            if(pair.getKey().getName().equals(name)){
                flaq = true;
            }
        }

        //Если есть - обновляю его список покупок
        if(flaq) {
            for (Map.Entry<Person, Map<String, Integer>> pair : shoppingList.entrySet()) {

                if (pair.getKey().getName().equals(name)) {
                    pair.setValue(shopList);
                }
            }
        }
        //Если нет - добавляю его в список покупок
        else {
            shoppingList.put(new Person(name), shopList);
        }
    }
}
