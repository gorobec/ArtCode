package week4.stack.stack_array;


import week4.stack.IMyStack;
import week4.stack.StackIsEmptyException;

import java.util.ArrayList;
import java.util.List;

public class MyArrayStack<E> implements IMyStack<E> {
    private List<E> stack = new ArrayList<>(10);

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public E peek() throws StackIsEmptyException {
        if(stack.size() == 0)
            throw new StackIsEmptyException();
        return stack.get(stack.size() - 1);
    }

    @Override
    public E pop() throws StackIsEmptyException {

        if(stack.size() == 0)
            throw new StackIsEmptyException();

        E e = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return e;
    }

    @Override
    public E push(E e) throws StackIsEmptyException {
        stack.add(e);
        return this.peek();
    }

    @Override
    public int search(E e) {
        for (int i = stack.size() - 1; i >= 0 ; i--) {
            if(e.equals(stack.get(i))) return stack.size() - i;
        }
        return -1;
    }
}
