package week4.stack.stack_array;

import week4.stack.IMyStack;
import week4.stack.StackIsEmptyException;

public class TestMyArrayStack {
    public static void main(String[] args) throws StackIsEmptyException {
        IMyStack myArrayStack = new MyArrayStack();
        myArrayStack.push(15);
        myArrayStack.push("Hello");
        myArrayStack.push('d');
        myArrayStack.push(true);
        boolean b = (boolean)myArrayStack.pop();
        System.out.println(b);
        char c = (char)myArrayStack.pop();
        System.out.println(c);
        String s = (String)myArrayStack.pop();
        System.out.println(s);
        int i = (int)myArrayStack.pop();
        System.out.println(i);
    }
}