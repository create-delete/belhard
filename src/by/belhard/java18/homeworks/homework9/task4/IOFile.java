package by.belhard.java18.homeworks.homework9.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {

    public void writeAccounts(List<Account> accounts, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for(Account a : accounts){
                writer.write(a.getName() + "  " + a.getMoney()) ;
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Account> readAccounts(String path) {
        String[] splitted;
        List<Account> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                splitted = reader.readLine().split(" ");

                result.add(new Account(splitted[0], Integer.parseInt(splitted[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Transaction> readTransactions(String path) {
        List<Transaction> transactionList = new ArrayList<>();
        String[] splitted;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                splitted = reader.readLine().split(" ");

                transactionList.add(new Transaction(splitted[0], splitted[1], Integer.parseInt(splitted[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactionList;
    }

    public void doTransaction(List<Account> accounts, List<Transaction> transactions) {

        for(Transaction t : transactions) {
            if (validateTransaction(accounts , t)) {
                Account sender = findAccout(accounts, t.getSender());
                Account receiver = findAccout(accounts, t.getReceiver());

                if(sender.getMoney() >= t.getAmount()) {
                    sender.setMoney(-t.getAmount());
                    receiver.setMoney(t.getAmount());
                }
            }
        }
    }

    private boolean validateTransaction(List<Account> accounts, Transaction transaction) {

        if (accounts.stream().anyMatch(a -> transaction.getSender().equals(a.getName()))
                && accounts.stream().anyMatch(a -> transaction.getReceiver().equals(a.getName()))
                && transaction.getAmount() > 0
        ) {
            return true;
        } else return false;
    }

    private Account findAccout(List<Account> accounts, String sender) {
        Account result = null;
        for (Account a : accounts) {
            if (a.getName().equals(sender)) result = a;
        }
        return result;
    }
}
