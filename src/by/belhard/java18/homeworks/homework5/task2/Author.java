package by.belhard.java18.homeworks.homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Author {
    private String name, surname;
    private int yearBirth;

    public Author(String name, String surname, int yearBirth) throws IOException { //throws само поставилось. Я понимаю что это значит, но оно само :)
        if (name != null || name != "") this.name = name;
        else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter realy name");
                String inputName = reader.readLine();
                if (inputName != null || inputName != "") {
                    this.name = inputName;
                    reader.close();
                    break;
                }
            }
        }
        if (surname != null || surname != "") this.surname = surname;
        else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter realy surname");
                String inputSurName = reader.readLine();
                if (inputSurName != null || inputSurName != "") {
                    this.name = inputSurName;
                    reader.close();
                    break;
                }
            }
        }
        if (yearBirth > 2 && yearBirth < 2014) this.yearBirth = yearBirth;
        else this.yearBirth = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String toString() {
        return name + " " + surname + ". " + (yearBirth == Integer.MAX_VALUE ? "Year of birth not specified." : "Born in " + yearBirth);
    }
}
