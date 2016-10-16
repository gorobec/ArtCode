package week2.day2;

/**
 * Created by gorobec on 16.10.16.
 */
public class MyArrayList{

    private Object[] elementData;
    private int size;
    private int defaultCapacity = 3;



    public MyArrayList(){
        elementData = new Object[defaultCapacity];
    }

    public MyArrayList(int capacity){
        elementData = new Object[capacity];

    }


    public boolean add(Object o){

        elementData[size++] = o;


        return true;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {


        return elementData[index];
    }
}
