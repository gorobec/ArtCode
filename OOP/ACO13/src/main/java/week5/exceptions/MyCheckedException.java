package week5.exceptions;

/**
 * Created by gorobec on 25.06.16.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
