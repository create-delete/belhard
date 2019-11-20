package by.belhard.java18.homeworks.homework9.task4;

public class Transaction {
    private final String sender;
    private final String receiver;
    private final int amount;

    public Transaction(String sender, String receiver, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public int getAmount() {
        return amount;
    }
}
