package week2.day2;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class StringClass {
    public static void main(String[] args) {
        String name = "Yevhen";
        String name4 = "Yevhen";

        String name2 = "";

        String name3 = new String("Yevhen");

        char[] array = {'Y', 'e', 'v', 'h', 'e', 'n'};
        String name5 = new String(array);

        System.out.println(name5);

        System.out.printf("Method \"isEmpty\" result %s\n",  name.isEmpty());
        System.out.printf("Method \"isEmpty\" result %s\n",  name2.isEmpty());

        System.out.printf("Method \"contains\" result %s\n",  name.contains("hen"));

        System.out.printf("Method \"equals\" result %s\n",  name.equals(name3));
        System.out.printf("Method \"equals\" result %s\n",  name.equals(name2));

        System.out.println(name == name4);
        System.out.println(name3 == "Yevhen");

        System.out.printf("Method \"equalsIgnoreCase\" result %s\n",  name.equalsIgnoreCase(name2));
        System.out.printf("Method \"compareTo\" result %s\n",  name.compareTo("Yevhenaa"));



        String substring = name.substring(3);
        System.out.printf("Method \"substring\" result %s\n", substring);
        System.out.printf("Method \"substring\" result %s\n",  name.substring(3, 6));
        System.out.printf("Method \"substring\" result %s\n",  name.substring(3, 6));
        System.out.println(name);

        System.out.printf("Method \"indexOf\" result %s\n",  name.indexOf("e"));
        System.out.printf("Method \"indexOf\" result %s\n",  name.indexOf("e", 2));
        System.out.printf("Method \"charAt\" result %s\n",  name.charAt(1));

        System.out.printf("Method \"length\" result %s\n",  name.length());
        System.out.printf("Method \"trim\" result %s\n",  "   Yevhen    ".trim());
        String[] split = "Hello Yevhen, how are you".split(",");
        System.out.printf("Method \"split\" result %s\n", Arrays.toString(split));
        char[] chars = name.toCharArray();
        System.out.printf("Method \"toCharArray\" result %s\n", Arrays.toString(chars));

        String result = String.format("Hello %s!", name);
        System.out.println(result);



    }
}
