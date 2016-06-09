package week5.day1;


import week4.linked_list.Node;

public class MyLinkedStack<E> implements IStack<E> {

    private Node<E> top;

    public MyLinkedStack() {
        this.top = new Node<>();
    }

    @Override
    public boolean isEmpty() {
        return top.getNext() == null;
    }
//Looks at the object at the top of this stack without removing it from the stack.
    @Override
    public E peek() {
        if(this.isEmpty())
            throw new StackIsEmptyException();
        return top.getValue();
    }
//Removes the object at the top of this stack and returns that object as the value of this function.
    @Override
    public E pop() {
        if(this.isEmpty())
            throw new StackIsEmptyException();
        E tmp = top.getValue();
        top = top.getNext();
        return tmp;
    }
//Pushes an item onto the top of this stack.
    @Override
    public E push(E e) {
        Node<E> tmp = new Node<>(e);
        tmp.setNext(top);
        top = tmp;
        return e;
    }

    @Override
    public int search(Object o) {
        int index = 1;
        Node<E> iterator = top;
        while(iterator != null){
            if(iterator.getValue().equals(o)) return index;
            iterator = iterator.getNext();
            index++;
        }
        return -1;
    }
}
