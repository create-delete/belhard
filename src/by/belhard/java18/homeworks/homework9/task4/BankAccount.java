package by.belhard.java18.homeworks.homework9.task4;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void setBalance(Integer balance) {
        if (balance != null) this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }
}
