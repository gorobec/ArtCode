package week5.arraylist;

public class TestMyAL {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(15);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
