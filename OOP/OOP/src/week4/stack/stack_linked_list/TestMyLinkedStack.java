package week4.stack.stack_linked_list;

import week4.stack.StackIsEmptyException;

public class TestMyLinkedStack {
    public static void main(String[] args) throws StackIsEmptyException {
      MyLinkedStack myLinkedStack = new MyLinkedStack<>();
        myLinkedStack.push(15);
        myLinkedStack.push("Hello");
        myLinkedStack.push('d');
        myLinkedStack.push(true);
        System.out.println(myLinkedStack.search('d'));
        boolean b = (boolean)myLinkedStack.pop();
        System.out.println(b);
        char c = (char)myLinkedStack.pop();
        System.out.println(c);
        String s = (String)myLinkedStack.pop();
        System.out.println(s);
        int i = (int)myLinkedStack.pop();
        System.out.println(i);

    }
}