package by.belhard.java18.homeworks.homework9.task4;

public class TransactionException extends RuntimeException {
    public TransactionException(String message){
        System.out.println("Операция не может быть завершена по причине:\n" + message);
    }
}
