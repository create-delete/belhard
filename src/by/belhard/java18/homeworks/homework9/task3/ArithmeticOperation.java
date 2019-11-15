package by.belhard.java18.homeworks.homework9.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.DoubleBinaryOperator;

/*
считать с консоли простое арифметическое выражение, например, 3 +11, 21-36, 18/ 5 или 3 * 123, вывести на консоль результат этого выражения.
Обратите внимание, что в строке могут быть пробелы(а могут и не быть).
Добавьте обработку неправильного ввода.
Добавьте циклический ввод.
 */
public class ArithmeticOperation {
    private static final DoubleBinaryOperator plus = (a, b) -> a + b;
    private static final DoubleBinaryOperator minus = (a, b) -> a - b;
    private static final DoubleBinaryOperator division = (a, b) -> a / b;
    private static final DoubleBinaryOperator multiply = (a, b) -> a * b;

    String input;

    public void arithmeticOperation() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            input = reader.readLine();
        } catch (IOException e) {
            e.getStackTrace();
        }

        System.out.println(useOperation(input));
    }

    private double useOperation(String str) {
        input = input.replaceAll("\\s+", "");

        DoubleBinaryOperator operator = null;

        String operation = input.replaceAll("[\\d.]*", "");

        switch (operation) {
            case "+":
                operator = plus;
                break;
            case "-":
                operator = minus;
                break;
            case "/":
                operator = division;
                break;
            case "*":
                operator = multiply;
                break;
            default:
                try {
                    throw new RuntimeException("Invalid operator!");
                } catch (RuntimeException e) {
                    System.err.println(e);
                }
        }

        String[] split = input.split("[" + operation + "]");

        return operator.applyAsDouble(
                Double.parseDouble(split[0]),
                Double.parseDouble(split[1]));
    }
}
