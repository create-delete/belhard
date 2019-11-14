package by.belhard.java18.lessons.lesson10.props;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileReader("prop.properties"));
        } catch (IOException e){
            System.err.println("No properties file!");
        }
    }

    public static void main(String[] args) {

        System.out.println("app name " + properties.getProperty("app.name"));
        System.out.println("name " + properties.getProperty("name"));
        System.out.println("first " + properties.getProperty("first"));

    }
}
