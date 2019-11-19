package by.belhard.java18.homeworks.homework9.task4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Operations {

    public Map<Person, BankAccount> readPersons(File file) {
        Map<Person, BankAccount> map = new HashMap<>();
        BankAccount bankAccount;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while (reader.ready()) {
                String[] temp = reader.readLine().trim().split("\\s+");
                bankAccount = new BankAccount(Integer.parseInt(temp[1]));

                map.put(new Person(temp[0], bankAccount), bankAccount);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return map;
    }

    public Map<Person, BankAccount> doTransaction(Map<Person, BankAccount> map, File file) {
        Map<String, Person> tempMap = new HashMap<>();
        Map<Person, BankAccount> result = new HashMap<>();
        //ИМЕЕТ СМЫСЛ СОЗДАВАТЬ ВРЕМЕННУЮ ПЕРЕМЕННУЮ МЕТОДА
        // ИЛИ МОЖНО РАБОТАТЬ НА ПРЯМУЮ С map из параметра И ВЕРНУТЬ ЕГО ЖЕ???????

        for (Map.Entry<Person, BankAccount> pair : map.entrySet()) {
            tempMap.put(pair.getKey().getName(), pair.getKey());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while (reader.ready()) {
                String[] temp = reader.readLine().trim().split("\\s+");

                if (tempMap.get(temp[0]) != null &&
                        tempMap.get(temp[1]) != null &&
                        tempMap.get(temp[0]).getBalance() > Integer.parseInt(temp[2])
                ) {
                    tempMap.get(temp[0]).setBalance(Integer.parseInt(temp[2]));
                    tempMap.get(temp[1]).setBalance(Integer.parseInt(temp[2]) * (-1));
                } else {
                    System.out.printf
                            ("The money transfer transaction from account %s to account %s cannot be completed%n" +
                                    "coz %s have %s money", temp[0], temp[1], temp[0], tempMap.get(temp[0]).getBalance());
                }
            }
        } catch (
                FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        /*for(Map.Entry<String, Person> pair : tempMap.entrySet()){
            result.put(pair.getValue(), new BankAccount(pair.getValue().getBalance()))
        }*/

        return map;
    }

    public void writeAccounts(Map<Person, BankAccount> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("BankAccounts.dt")))) {
            for (Map.Entry<Person, BankAccount> pair : map.entrySet()) {
                writer.write(pair.getKey().getName() + " " + pair.getValue().getBalance());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
