package by.belhard.java18.homeworks.homework9.task4;

import java.io.File;
import java.util.Map;

/*
В файле balance.dt хранятся данные о балансе счетов людей. ++ Считал
Имена не повторяются.                           Напрашивается МАР, но я почему то решил использвать просто класс
В файле transactions.dt хранятся данные о транзакциях - кто и кому пытался передать деньги.
(Выкидывать Exception или невозможные транзакции сохранять в инвалид-список и потом выводить отдельно?)
Если выкидывать исключение - программа завершиться - нам это не совсем то и надо - надо попробовать
Обратите внимание, транзакция может быть невалидной, если невозможно определить отправителя или получателя средств,
а также если на счету отправителя не хватает средств для перевода.
В таком случае транзакция отклоняется (не выполняется).
Записать в выходной файл количество средств на счетах людей после выполнения валидных транзакций. Файлы в архиве в аттаче.
 */
public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Map<Person, BankAccount> persons;

        persons = operations.readPersons(new File("balance.dt"));


        persons = operations.doTransaction(persons, new File("transactions.dt"));

        operations.writeAccounts(persons);
    }
}
