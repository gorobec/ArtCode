package week3.day2.time_counting;


import week2.library.Book;

import java.util.ArrayList;

public class TestTimeCounter {
    public static void main(String[] args) {

        Long result1 = new TimeCounter().countAction(new MyActionArray());
        System.out.printf("Array fill for - %d ms,\n", result1);

        Long result2 = new TimeCounter().countAction(new MyActionList());
        System.out.printf(" List fill for - %d ms\n", result2);


    }
}
class MyActionArray implements Action{

    @Override
    public void runAction() {
        Book[] array = new Book[5_000_000];
        for (int i = 0; i < 5_000_000; i++) {
            array[i] = new Book("Abc", "def", 123);
        }
    }
}

class MyActionList implements Action{

    @Override
    public void runAction() {
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Book("Abc", "def", 123));
        }
    }
}