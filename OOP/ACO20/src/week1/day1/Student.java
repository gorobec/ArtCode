package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Student {

    private String name;
    private String surName;
    private int age;

    public Student(){
    }

    public Student(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String asString(){
        return String.format("Student name - %s, surName - %s, age - %d",
                name, surName, age);
    }

    public boolean equalTo(Student student) {
        if(student == null) return false;
        if(student == this) return true;
        if(this.name.equals(student.name) &&
                this.surName.equals(student.surName)) return true;
        return false;
    }
}
