package week3.day1;


public class TestVarargs {
    public static void main(String[] args) {
        showContent(5);

    }
    public static void showContent(int i){
        System.out.println(i);
    }

    public static void showContent(int... i){
        for (int i1 : i) {
            System.out.println(i1);
        }
//        System.out.println("g");

    }

    /*public static void showContent(int j, int... i){
        for (int i1 : i) {
            System.out.println(i1);
        }

    }*/
}



