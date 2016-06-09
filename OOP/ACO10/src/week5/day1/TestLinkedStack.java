package week5.day1;

public class TestLinkedStack {
    public static void main(String[] args) {
        IStack<String> list = new MyLinkedStack<>();
        System.out.println(list.isEmpty());
        /*list.push("Kate");
        list.push("Artem");
        list.push("Sergij");
        list.push("Evgen");*/
//        System.out.println(list.search("Artem"));
//        System.out.println(list.isEmpty());
        System.out.println(list.peek());
    }
}
