package week3.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Student {
    static String className = "Student";
    String name;
    int age;
    boolean sex;

    public Student (String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void printInfo(){
        System.out.printf("Name - %s, age - %d, Sex - %s\n",
                name, age, sex ? "Male" : "Female");
    }

}
