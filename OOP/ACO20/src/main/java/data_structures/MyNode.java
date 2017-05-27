package data_structures;

/**
 * Created by gorobec on 27.05.17.
 */
public class MyNode {
    private MyNode next;
    private MyNode previous;
    private Object value;

    public MyNode() {
    }

    public MyNode(Object value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
