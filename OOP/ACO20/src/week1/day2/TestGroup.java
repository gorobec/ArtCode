package week1.day2;

import week1.day1.Student;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class TestGroup {
    public static void main(String[] args) {

        Student student1 = new Student("Maxim", "Muzichenko", 29);
        Student student2 = new Student("Maxim2", "Muzichenko", 29);
        Student student3 = new Student("Maxim3", "Muzichenko", 29);

        Student[] students = {student1, student2, student3};

        Group group = new Group(20, 8);
        Group group2 = new Group(20, students);


//        System.out.println(group2.asString());
        System.out.println(group.asString());

        /*System.out.println(student1.name);
        System.out.println(students[0].name);
        System.out.println(group2.students[0].name);

        group2.students[0].name = "Oleh";
        System.out.println(student1.name);
        System.out.println(students[0].name);
        System.out.println(group2.students[0].name);
        group2.students[0] = new Student("Masha", "Medved'", 13);

        System.out.println(student1.name);
        System.out.println(students[0].name);
        System.out.println(group2.students[0].name);*/
    }
}
