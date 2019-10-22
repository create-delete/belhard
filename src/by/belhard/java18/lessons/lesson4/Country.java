package by.belhard.java18.lessons.lesson4;

public class Country {

    String title;
    int zipCode;

    public Country(String title, int zipCode){
        this.title = title;
        this.zipCode = zipCode;
    }

    public Country(){
        title = "NOLAND";
        zipCode = 111111;
    }
}
