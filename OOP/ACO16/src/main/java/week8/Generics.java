package week8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gorobec on 26.11.16.
 */
public class Generics {
    public static void main(String[] args) {

        SomeClass<Number> someClass = new SomeClass<>();

        List<Integer> list = new ArrayList<>();
        someClass.add(5);

        List<Number> numberList = new LinkedList<>();

        numberList.add(5);
    }
}
