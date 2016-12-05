package week7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.MyDate;
import week1.day2.student.Gender;
import week1.day2.student.Group;
import week1.day2.student.Student;


public class JSONIntro {
    public static void main(String[] args) {

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

        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);
        aco13.addStudent(st3);
        aco13.addStudent(st4);


//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(aco13);

//        System.out.println(json);


        Group copy = gson.fromJson(json, Group.class);

        copy.showGroup();
    }
}
