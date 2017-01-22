package week1.week2.student_task;


/**
 * Created by gorobec on 22.01.17.
 */
public class Group {
    private String name;
    private Student[] students;

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
    public void showStudents(){
        for (Student student : students) {
            System.out.println(student.asString());
        }
    }

    public String getName() {
        return name;
    }
}
