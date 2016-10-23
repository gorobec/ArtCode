package week3.day1;

import week1.student_task.BudgetStudent;
import week1.student_task.ContractStdent;
import week1.student_task.Student;

/**
 * Created by gorobec on 22.10.16.
 */
public class TestFinal {
    public static void main(String[] args) {
        Student student = new ContractStdent("Nick", "Smith", 5, 6);
        Student student2 = new ContractStdent("Jack", "Smith", 4, 3);
        Student student3 = new ContractStdent("John", "Smith", 3, 4);
        Student student4 = new ContractStdent("Kevin", "Smith", 4.5, 2);


        Student student5 = new BudgetStudent("David", "Smith", 5, 600);
        Student student6 = new BudgetStudent("Dan", "Smith", 4.3, 350);
        Student student7 = new BudgetStudent("Brandon", "Smith", 3.8, 400);
        Student student8 = new BudgetStudent("Jeremy", "Smith", 4.9, 250);


        Student[] students = new Student[4];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        FinalWord finalWord = new FinalWord("Name", 15, students);

        System.out.println(finalWord);

        students[0] = student8;

        System.out.println(finalWord);
    }
}
