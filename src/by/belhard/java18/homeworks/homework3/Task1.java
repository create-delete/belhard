package by.belhard.java18.homeworks.homework3;

/*Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
        Например, при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер, от 21 до 30 майку, выше 30 – ничего.*/

// По условию в градусах от 15 до 16 и от 20 до 21 программа ничего не делает. Слегка сдвинул
// switch требует int и не разрешает условие в case

public class Task1 {
    public static void main(String[] args) {

        double temperatureС = 15.3;

        if (temperatureС < 10) System.out.println("Куртка");
        else if (temperatureС >= 10 && temperatureС < 15) System.out.println("Ветровка");
        else if (temperatureС >= 15 && temperatureС < 20) System.out.println("Свитер");
        else if (temperatureС >= 20 && temperatureС < 30) System.out.println("Майка");
        else System.out.println("Ничего не одевай");
    }
}
