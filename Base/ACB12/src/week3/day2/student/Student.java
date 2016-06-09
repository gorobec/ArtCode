package week3.day2.student;


public class Student {
    int age;
    String name;
    int weight;
    String sex;
    String phone;

    public void sayInfo(){
        System.out.printf("Student %s - age %d, phone - %s, weight %d\n",
                name, age, phone, weight);
    }
}
