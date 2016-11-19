package data_structures.set;

import week1.student_task.AverageMarkComparator;
import week1.student_task.BudgetStudent;
import week1.student_task.ContractStdent;
import week1.student_task.Student;

/**
 * Created by gorobec on 19.11.16.
 */
public class TestSet {
    public static void main(String[] args) {
        Student student = new ContractStdent("Nick", "Smith", 5, 6);
        Student student2 = new ContractStdent("Jack", "Smith", 4, 3);
        Student student3 = new ContractStdent("John", "Smith", 3, 4);
        Student student4 = new ContractStdent("Kevin", "Smith", 4.5, 2);


        Student student5 = new BudgetStudent("David", "Smith", 5, 600);
        Student student6 = new BudgetStudent("Dan", "Smith", 4.3, 350);
        Student student7 = new BudgetStudent("Brandon", "Smith", 3.8, 400);
        Student student8 = new BudgetStudent("Jeremy", "Smith", 4.9, 250);

//        Set<Student> bst = new MyBinarySearchTree<>();
        Set<Student> bst = new MyBinarySearchTree<>(new AverageMarkComparator());
        bst.add(student);
        bst.add(student2);
        bst.add(student3);
        bst.add(student4);
        bst.add(student5);
        bst.add(student6);
        bst.add(student7);
        bst.add(student8);


    }
}
