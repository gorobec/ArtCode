package week5.exceptions;

/**
 * Created by gorobec on 05.11.16.
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
