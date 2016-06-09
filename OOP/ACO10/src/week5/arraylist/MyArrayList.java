package week5.arraylist;

public class MyArrayList<T> {
    private T[] array;
    private int size;

    public MyArrayList() {
        this.array = (T[])new Object[10];
    }

    public MyArrayList(int capacity) {
//        todo exception
//        throw ....
        this.array = (T[])new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public boolean add(T o){
        if (size == array.length){
            resizeAL();
        }
        array[size] = o;
        size++;
        return true;
    }

    public Object get(int index){
//        todo check idx arrayBound
        return array[index];
    }

    private void resizeAL() {
        T[] newArray = (T[])new Object[(size * 3) / 2 + 1];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
