package by.belhard.java18.homeworks.homework8.task4;


import java.util.HashMap;
import java.util.Map;

public class ShoppingList {

    private Map<Buyer, Map<String, Integer>> shoppingList;

    public ShoppingList() {
        shoppingList = new HashMap<>();
    }

    public Map<Buyer, Map<String, Integer>> getShoppingList() {
        return shoppingList;
    }

    public void addBuyer(Buyer buyer, Map<String, Integer> shopList) {

        shoppingList.put(buyer, shopList);
    }

    public void switchPurchaseByPerson(String name, String purchase, Integer qty) {
        boolean flaq = false;

        // Проверяю есть ли человек с таким именем в списке
        // Подразумевается, что у всех уникальное имя
        for (Map.Entry<Buyer, Map<String, Integer>> pair : shoppingList.entrySet()) {

            if (pair.getKey().getName().equals(name)) {
                flaq = true;
            }
        }

        // Если есть - обновляю его список покупок
        if (flaq) {
            for (Map.Entry<Buyer, Map<String, Integer>> pair : shoppingList.entrySet()) {

                if (pair.getKey().getName().equals(name)) {
                    Map<String, Integer> tempMap = pair.getValue();

                    //Ищем есть ли такой товар в списке. Если есть - надо изменить его кол-во
                    tempMap = switchQty(tempMap, purchase, qty);

                    shoppingList.put(pair.getKey(), tempMap);
                }
            }
        }
        //Если нет покупателя - добавляю его в список покупок
        else {

            shoppingList.put(new Buyer(name), new HashMap<>(Map.of(purchase, qty)));
        }
    }

    public void printShoppingList() {
        Map<String, Integer> printMap = new HashMap<>();

        for(Map.Entry<Buyer, Map<String, Integer>> firstFor : shoppingList.entrySet()){
            Map<String, Integer> tempMap = new HashMap<>();
            tempMap.putAll(firstFor.getValue());
            for(Map.Entry<String,Integer> pair : tempMap.entrySet()) {
                printMap = switchQty(printMap, pair.getKey(), pair.getValue());
            }
        }

        for(Map.Entry<String, Integer> pair : printMap.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

    private static Map<String, Integer> switchQty(Map<String, Integer> map, String key, int newQty) {

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getKey().equals(key)) {
                result.put(key, (m.getValue() + newQty));
            } else {
                result.put(m.getKey(), m.getValue());
            }
        }
        //Если товара раньше не было - добавляем его в список
        if (!result.containsKey(key)) {

            result.put(key, newQty);
        }

        return result;
    }
}
