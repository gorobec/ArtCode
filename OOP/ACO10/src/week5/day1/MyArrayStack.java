package week5.day1;


import java.util.ArrayList;

public class MyArrayStack<E> implements IStack<E>{
    private ArrayList<E> list;

    public MyArrayStack(ArrayList<E> list) {
        this.list = list;
    }

    public MyArrayStack() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E peek() {
        if(this.isEmpty())
            throw new StackIsEmptyException();
        return list.get(list.size() - 1);
    }

    @Override
    public E pop() {
        if(this.isEmpty())
            throw new StackIsEmptyException();
        E tmp = this.peek();
        list.remove(list.size() - 1);
        return tmp;
    }

    @Override
    public E push(E e) {
        list.add(e);
        return e;
    }

    @Override
    public int search(Object o) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if(list.get(i).equals(o)){
                return list.size() - i;
            }
        }
        return -1;
    }
}
