package by.belhard.java18.homeworks.homework9.task4;

public class Person {
    private BankAccount bankAccount;
    private String name;

    public Person (String name, double balance){
        this.name = name;
        bankAccount = new BankAccount(balance);
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public void setBalance(double balance) {
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
