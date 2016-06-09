package week5.day1;


public class StackIsEmptyException extends RuntimeException {
    public StackIsEmptyException() {
        super("This stack is empty");
    }

}
