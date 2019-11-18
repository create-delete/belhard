package by.belhard.java18.homeworks.homework9.task4;

import java.io.File;
import java.util.ArrayList;

/*
В файле balance.dt хранятся данные о балансе счетов людей. ++ Считал
Имена не повторяются.
В файле transactions.dt хранятся данные о транзакциях - кто и кому пытался передать деньги.
(Выкидывать Exception или невозможные транзакции сохранять в инвалид-список и потом выводить отдельно?)
Если выкидывать исключение - программа завершиться - нам это не совсем то и надо - надо попробовать
Обратите внимание, транзакция может быть невалидной, если невозможно определить отправителя или получателя средств, а также если на счету отправителя не хватает средств для перевода.
В таком случае транзакция отклоняется (не выполняется).
Записать в выходной файл количество средств на счетах людей после выполнения валидных транзакций. Файлы в архиве в аттаче.
 */
public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        ArrayList<Person> balanceList;

        File balance = new File("balance.dt");
        balanceList = operations.readPersons(balance);

        System.out.println(balanceList);

    }
}
