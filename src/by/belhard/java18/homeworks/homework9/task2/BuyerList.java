package by.belhard.java18.homeworks.homework9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

            ЕСЛИ ЕСТЬ КОММЕНТАРИИ - ТЫ МНЕ ОБЯЗАТЕЛЬНО СКАЖИ,
            ПОТОМУ ЧТО У МЕНЯ МНОГО ВОПРОСОВ ВОЗНИКАЛО ВО ВРЕМЯ
            РЕШАНИЯ ЭТОЙ ЗАДАЧИ

 */

public class BuyerList {
    private int qtyStr;
    private double totalPrice = 0;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String[] inputStrings;

    public BuyerList() {
        System.out.println("Введите количество вводимых строк");
        try {
            this.qtyStr = Integer.parseInt(reader.readLine());
            inputStrings = new String[qtyStr];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setInputStrings() {
        totalPrice = 0;

        inputStrings = new String[qtyStr];
        for (int i = 0; i < qtyStr; i++) {
            System.out.println("Введите " + (i + 1) + " строку.");
            try {
                inputStrings[i] = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(int i = 0; i<inputStrings.length; i++){
            String[]temp = inputStrings[i].trim().split("\\s+");

            totalPrice += Double.parseDouble(temp[1]) * (int)Double.parseDouble(temp[2]);
        }
    }

    public void printTotalPrice (){
        System.out.printf("Total price: %.2f", totalPrice);
    }
}



