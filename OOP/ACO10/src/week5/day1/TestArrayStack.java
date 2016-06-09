package week5.day1;

public class TestArrayStack {
    public static void main(String[] args) {
        IStack<String> stack = new MyArrayStack();
//      Stack<String> stack = new Stack<>();
        stack.push("Kate");
        stack.push("Evgen");
        stack.push("Artem");
        stack.push("Sergij");
        stack.push("Evgen");
        System.out.println(stack.peek());
//      System.out.println(stack.search("Evgen"));
    }
}
