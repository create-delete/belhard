package by.belhard.java18.lessons.lesson8.try1.exceptions;

public class InvalidFuelParameterException extends RuntimeException {
    public InvalidFuelParameterException(String parameter) {
        super(parameter);
    }
}
