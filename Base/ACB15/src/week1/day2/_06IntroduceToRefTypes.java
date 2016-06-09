package week1.day2;

/**
 * Created by gorobec on 10.04.16.
 */
public class _06IntroduceToRefTypes {
    public static void main(String[] args) {
        char letter = 'J';
        char letter2 = 'e';
        char letter3 = 'n';
        char letter4 = 'j';
        char letter5 = 'a';

        System.out.println("My name is " + letter + letter2 +
                letter3 + letter4 + letter5);
        System.out.print(letter);
        System.out.print(letter2);
        System.out.print(letter3);
        System.out.print(letter4);
        System.out.print(letter5);
        System.out.println();
//      1)String <name> = "<value>";
//      2)String <name> = new String("<value>");
        String name = "Jenja";
        System.out.println(name);
        String newName = new String("Jenja");
        System.out.println(newName);

    }
}
