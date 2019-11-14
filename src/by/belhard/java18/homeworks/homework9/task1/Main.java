package by.belhard.java18.homeworks.homework9.task1;

//создать файл с числами, разделенными пробелами. Записать в другой файл кубы этих чисел

import java.io.*;


/**
 *
 * Вопрос:
 * Надо делать два отдельных try {} catch  ? или у меня норм решение?
 * Т.е. может нет смысла держать открытый writer пока работает reader и наоборот?
 *
 */

public class Main {
    public static void main(String[] args) {
        File file = new File("input.ti");
        try (BufferedReader reader = new BufferedReader(new FileReader("input.ti"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.to"))
        ) {
            String[] splitted = reader.readLine().trim().split("\\s+");

            for (int i = 0; i < splitted.length; i++) {
                int number = Integer.parseInt(splitted[i]);

                writer.write((number*number*number) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
