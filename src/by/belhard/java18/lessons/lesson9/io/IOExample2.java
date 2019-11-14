package by.belhard.java18.lessons.lesson9.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class IOExample2 {

    private static final Map<String, Map<String, Integer>> requestes = new HashMap<>();

    public static void main(String[] args) {

        try (BufferedReader fReader = new BufferedReader(new FileReader("testInput.ti"));
             BufferedWriter fWriter = new BufferedWriter(new FileWriter("testOutput.to"))) {

            BiConsumer<String, Map<String, Integer>> consumer = (name, map) -> {
                try {
                    fWriter.write(name);
                    fWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                map.forEach((product, quantity) -> {
                    String str = (product + " : " + quantity);
                    try {
                        fWriter.write(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            };

            while (fReader.ready()) {
                String[] splitted;
                splitted = fReader.readLine().split("\\s+");

                String name = splitted[0];
                String first = splitted[1];
                int firstCount = Integer.parseInt(splitted[2]);

                String second = splitted[3];
                int secondCount = Integer.parseInt(splitted[4]);

                Map<String, Integer> map = new HashMap<>();
                map.put(first, firstCount);
                map.put(second, secondCount);


                requestes.put(name, map);
            }

            requestes.forEach(consumer);

        } catch (IOException e) {
            e.printStackTrace();
        }

        requestes.forEach((name, map) -> {


            System.out.println(name);
            map.forEach((product, quantity) -> {
                System.out.printf("\t%s : %d\n", product, quantity);
            });
        });
    }
}
