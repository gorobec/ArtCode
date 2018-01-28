package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Yevhen", 28, true);
        Student student2 = new Student("Maxim", 30, true);

        /*student.printInfo();
        student2.printInfo();*/

        Student[] students = new Student[2];

        students[0] = student;
        students[1] = student2;

        Group group = new Group("ACB24", students);

        group.print();

        Group group1 = new Group("ACB25");

        group1.students[0] = student;

        group1.print();

        System.out.println(group1.addStudent(student2));
        group1.print();

        System.out.println(group1.addStudent(student2));
        group1.print();
    }
}
