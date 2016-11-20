package week1.student_task;

import java.io.Serializable;

/**
 * Created by gorobec on 08.10.16.
 */
public class Student implements Comparable<Student>, Serializable{

    private String name;
    private String surname;
    private transient double averageMark;

//    public Student(){}

    public Student(String name, String surname, double averageMark){
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMark() {
        return averageMark;
    }

    public void setMark(double averageMark) {
        this.averageMark = averageMark;
    }

    /*@Override
    public boolean equals(Object o){

    }
    */

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format(" name - %s, surname - %s, average mark - %.2f", name, surname, averageMark);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;
        return surname.equals(student.surname);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }

    @Override
    public int compareTo(Student o) {

        int answer = name.compareTo(o.name);
        if(answer != 0) return answer;
        return surname.compareTo(o.surname);

    }
}
