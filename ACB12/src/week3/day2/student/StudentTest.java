package week3.day2.student;


public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Olja";
        student1.age = 25;
        student1.phone = "093555855";
        student1.sex = "Female";
//        student1.weight = 50;



        Student student2 = new Student();
        student2.name = "Kolja";
        student2.age = 35;
        student2.phone = "0978888955";
        student2.sex = "Male";
//        student2.weight = 80;

        Student[] group = new Student[2];
        group[0] = student1;
        group[1] = student2;

        for (int i = 0; i < group.length; i++) {
            group[i].sayInfo();

        }
    }
}
