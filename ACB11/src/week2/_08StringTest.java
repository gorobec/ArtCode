package week2;


import utils.ArrayUtils;

public class _08StringTest {

    public static void main(String[] args) {

        String s = "Hello";
        String s2 = "Hell";
        s2 = s2 + "o";

        int a =5;
        int b = 6;

        boolean c = a == b;
        boolean c2 = s2==s;
        System.out.println(c);
        System.out.println(c2);

        s.equals("Hello");
        s.equals(s2);
        System.out.println(s.equals("Hello"));


        System.out.println(s.charAt(1));

        System.out.println(s.length());
        s = s.concat(" World");
        System.out.println(s);
        char[] letters = s.toCharArray();
        String s3 = "";

        System.out.println(s.compareTo("hello World"));
        System.out.println(s.compareToIgnoreCase("hello World"));
        System.out.println(s.endsWith("rld"));
        System.out.println(s.startsWith("hell"));
        System.out.println(s.equalsIgnoreCase("heLLo wOrld"));
        System.out.println(s3.isEmpty());
        String s4 = "Hello my 1ame is Vova!";
        String[] s6 = s4.split(" ");
        ArrayUtils.printArrayString(s6);
        System.out.println(s4.indexOf('e'));
        System.out.println(s4.lastIndexOf('e'));

    }

}
