package by.belhard.java18.lessons.lesson4;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    public Person(String name, int age, Country country) {
        new Person(name, age, country, Sex.MALE); // 4 params
        //this(name,age,country,Sex.MALE);
    }
    public Person(String name, Country country) {
        //new Person(name, 17 , country, Sex.MALE); // 4 params
        this(name,17,country,Sex.MALE);
    }

    public Person(String name, int age) {
        this(name,age,new Country("NOLAND",111111));
    }

    public Person(String name) {
        this(name, 0);
    }

    public Person() {
        this("NONAME");
    }

    public int growOld(){
        return ++age;
    }

    public void eat(String dish){
        System.out.printf("%s eating %s. Om-nom-nom\n", name, dish);
    }
    public Country getCountry(){
        return this.country;
    }
}
