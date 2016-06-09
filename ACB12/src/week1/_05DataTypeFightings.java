package week1;


public class _05DataTypeFightings {
    public static void main(String[] args) {
        int i = 15;
        double d = 25.3;

        double a = i + d;

//        double + *(anyone) = double
//        float + * = float
//        long + * = long
//        int + byte(short, char);

        int b = i + 'A';
        System.out.println(b);

        String s = "Name";
        s = s + d;


    }

}
