package week5.exceptions;

/**
 * Created by gorobec on 05.11.16.
 */
public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
