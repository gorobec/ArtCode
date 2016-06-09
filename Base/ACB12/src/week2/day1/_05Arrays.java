package week2.day1;


public class _05Arrays {
    public static void main(String[] args) {
        String name1 = "Olja";
        String name2 = "Kolja";
        String name3 = "Tolja";

//    <type>[] <variableName> = new <type>[<size>];

        String[] names = new String[3];
        names[0] = "Olja";
        names[1] = name2;
        names[2] = name3;

        System.out.println(names[0] + ", " + names[1]+ ", " +names[2]);
    }
}
