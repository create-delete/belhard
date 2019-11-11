package by.belhard.java18.homeworks.homework8.task2;

import java.util.ArrayList;
import java.util.List;

/*
2) Создать класс Person с полем String name.
В другом классе создать поле List<Person> persons.
Записать в список 5 экземпляров класса Person.
Создать метод, который будет принимать параметр String name и возвращать из списка объект Person с таким именем (либо null, если человека с таким именем нет в списке).
После этого вызвать у получившегося объекта метод toString().
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Игорь"));
        persons.add(new Person("Роман"));
        persons.add(new Person("Максим"));
        persons.add(new Person("Катя"));
        persons.add(new Person("Лох"));

        Person person = getPersonByName(persons, "Роман");

        System.out.println(person);
    }
    //Не понимаю как сделать без передачи Листа
    private static Person getPersonByName(List<Person> personList, String name){

        Person result = null;

        for(Person p : personList) {
            if(p.getName().equals(name)) {
                result = new Person(p.getName());
            }
        }

        return result;
    }
}
