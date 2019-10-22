package by.belhard.java18.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        Country country = new Country("Brazil", 123456);

        Person person1 = new Person("Alfredo", country);
        Person person2 = new Person("Tereza", 16, person1.country, Sex.FEMALE);
        Person polina = new Person("Polina", 300, new Country("Belarus", 375), Sex.FEMALE);


        person1.eat("fish");
        person2.eat("chips");

    }
}
