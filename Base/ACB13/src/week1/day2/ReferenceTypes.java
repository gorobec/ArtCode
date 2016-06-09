package week1.day2;


public class ReferenceTypes {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'n';
        char letter3 = 'n';
        char letter4 = 'a';
        System.out.print(letter1);
        System.out.print(letter2);
        System.out.print(letter3);
        System.out.println(letter4);

        String name = "Anna";
        System.out.println(name);
//        not recommended
        String name2 = new String("Anna");
        String greeting = "Hello!";
        String s = greeting + " " + name;
        System.out.println(s);
        System.out.println(greeting + " " + name);
        /*String m = "5";
        int c = m * 2;*/

    }
}
