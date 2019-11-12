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

        //  ??????????????????????????????????????????????????
        // pair.setValue(shopList); - работает с переменной на прямую или с ее копией?
        // то есть вопрос в том, поменяется ли значение в списке или
        // надо использовать конструкцию типо shopingList = что то;
        // ???????????????????????????????????????????????????????


        // Если есть - обновляю его список покупок
        if (flaq) {
            for (Map.Entry<Buyer, Map<String, Integer>> pair : shoppingList.entrySet()) {

                if (pair.getKey().getName().equals(name)) {
                    Map<String, Integer> tempMap = pair.getValue();

                    //Ищем есть ли такой товар в списке. Если есть - надо изменить его кол-во

                    tempMap = switchQty(tempMap, purchase, qty);

                    //если нет - просто добавляю в список товар
                    if(!tempMap.containsKey(purchase)){

                        tempMap.put(purchase, qty);
                        shoppingList.put(pair.getKey(), tempMap);
                    }

                    //если нет - просто добавляю в список товар
                }
            }
        }
        //Если нет покупателя - добавляю его в список покупок
        else {

            shoppingList.put(new Buyer(name), new HashMap<>(Map.of(purchase, qty)));
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

        return result;
    }
}
