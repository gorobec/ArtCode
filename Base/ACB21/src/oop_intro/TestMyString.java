package oop_intro;

/**
 * Created by user on 04.01.2017.
 */
public class TestMyString {
    public static void main(String[] args) {
        MyString myString = new MyString();

        myString.init("Yevhen");

        MyString myString2 = new MyString();

        myString2.init("Yevhenij");

        System.out.println(myString.length());
        System.out.println(myString.equals(myString2));
    }
}
