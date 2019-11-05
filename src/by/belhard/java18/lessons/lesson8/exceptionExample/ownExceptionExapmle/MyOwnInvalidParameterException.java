package by.belhard.java18.lessons.lesson8.exceptionExample.ownExceptionExapmle;

public class MyOwnInvalidParameterException extends Exception {

    public MyOwnInvalidParameterException (int i, int k) {
        super(prepareMessage(i,k));
    }

    private static String prepareMessage(int i, int k) {

        return String.format("Invalid parameters: %d, %d", i, k);
    }

}
