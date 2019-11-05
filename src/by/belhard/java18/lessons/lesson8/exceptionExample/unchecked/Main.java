package by.belhard.java18.lessons.lesson8.exceptionExample.unchecked;

public class Main {
    public static void main(String[] args) {

        System.out.println(getElementByIndex(new String[]{"0", "1", "2"}, 1));
        System.out.println(getField(new SecondWithField()));
    }

    private static int getField(ExampleWithField o) {

        return o.a;
    }

    private static String getElementByIndex(String[] strings, int i) {
        return strings[i];
    }
}
