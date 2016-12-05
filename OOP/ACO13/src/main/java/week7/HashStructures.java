package week7;

import utils.MyDate;
import week1.day2.student.Gender;
import week1.day2.student.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gorobec on 09.07.16.
 */
public class HashStructures {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        HashSet<String>strings = new HashSet<>();

        strings.add("A");
        strings.add("C");
        strings.add("B");
        strings.add("F");
        strings.add("Z");

        System.out.println(strings.contains("F"));

        /*for (String string : strings) {
            System.out.println(string);
        }*/

        Student st1 = new Student("Alex",
                new MyDate(1977, 12, 12),
                Gender.MALE);
        Student st2 = new Student("Johnny",
                new MyDate(1963, 12, 12),
                Gender.MALE);
        Student st3 = new Student("Anna",
                new MyDate(1999, 12, 12),
                Gender.FEMALE);
        Student st4 = new Student("Kate",
                new MyDate(2014, 12, 12),
                Gender.FEMALE);

        Student st5 = new Student("Kate",
                new MyDate(2014, 12, 12),
                Gender.FEMALE);



        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);


        System.out.println(set.contains(st5));
    }
}
