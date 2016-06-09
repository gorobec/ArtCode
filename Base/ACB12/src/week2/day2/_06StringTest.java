package week2.day2;




public class _06StringTest {
    public static void main(String[] args) {
        String name = new String("jenja");
        System.out.println(name);
        String name2 = "Jenja";
        System.out.println(name2);
        char[] letters = {'O', 'l', 'j', 'a'};
        String name3 = new String(letters);
        System.out.println(name3);

        boolean equals = name.equals(name2);
        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf('h');
        char[] letters2 = name.toCharArray();
        String subString = name.substring(0, 4);
        String sub2 = name.substring(1);
        boolean answer = name.endsWith("j");
        boolean answer2 = name.contains("j");
        String[] names = name2.split(", ");
        String newName = name.toUpperCase();
        int compare = name.compareTo(name2);
        System.out.println(compare);
    }
}
