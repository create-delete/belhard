package by.belhard.java18.homeworks.homework9.task4;

import java.io.*;
import java.util.ArrayList;

public class Operations {

    public ArrayList<Person> readPersons(File file) {
        ArrayList<Person> listPersons = new ArrayList<>();
        String[] splitted;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while(reader.ready()){
                splitted = reader.readLine().split(" ");

                listPersons.add(new Person(splitted[0], Double.parseDouble(splitted[1])));
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        return listPersons;
    }
}
