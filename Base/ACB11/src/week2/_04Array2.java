package week2;


import utils.ArrayUtils;

public class _04Array2 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        String  names1[], names2[], names3[];

        String[] names  = new String[4];
//        read write
        names[0] = "John";

        System.out.println(names[0] + " "
                + names[1]
                + " " + names[2]);

        /*for(int i = 0; i < names.length;i ++){
            System.out.println(names[i]);
        }*/

        ArrayUtils.printArrayString(names);

    }
}
