package by.belhard.java18.homeworks.homework9.task4;

public class Person {
    private BankAccount bankAccount;
    private String name;

    public Person(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void setBalance(int balance) {
        bankAccount.setBalance(balance);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "bank balance=" + bankAccount.getBalance() +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
