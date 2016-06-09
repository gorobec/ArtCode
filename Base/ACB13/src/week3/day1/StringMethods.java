package week3.day1;

/**
 * Created by gorobec on 30.01.16.
 */
public class StringMethods {
    public static void main(String[] args) {
        String s = "He@LLLo";
        String s2 = "hello";
        System.out.println(s.equals(s2));
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareToIgnoreCase(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
//        we don't change String!!!!
        System.out.println(s);
        System.out.println(s.indexOf('L'));
        System.out.println(s.lastIndexOf('L'));
        System.out.println(s.lastIndexOf('L', 3));
//        StringIndexOutOfBoundsException!
        System.out.println(s.charAt(5));
        System.out.println(s.contains("@"));
        System.out.println(s.startsWith("HeL"));
        System.out.println(s.endsWith("Lo"));
        System.out.println(s.concat(s2));

    }
}
