package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */

public class Group {
    String name;
    Student[] students;

    public Group (String name) {
        this.name = name;

        students = new Student[2];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }


    public boolean addStudent(Student student) {

        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) {

                students[i] = student;
                return true;
            }
        }

        return false;
    }

    public void print() {
        System.out.printf("Group name - %s\n", name);
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                students[i].printInfo();
            }
        }

    }
}
