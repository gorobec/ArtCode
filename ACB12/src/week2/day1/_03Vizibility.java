package week2.day1;

public class _03Vizibility {
    public static void main(String[] args) {
        String directorName = "Serhij";
        int age = 25;

        if(true) {
            String eployeeName = "Jenja";
            System.out.println(directorName);
            System.out.println(eployeeName);
        }
//        System.out.println(eployeeName);
        System.out.println(directorName);

    }



}
