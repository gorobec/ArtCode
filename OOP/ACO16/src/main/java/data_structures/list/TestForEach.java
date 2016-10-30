package data_structures.list;

/**
 * Created by gorobec on 30.10.16.
 */
public class TestForEach {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
