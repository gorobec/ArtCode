package week1.student_task;

/**
 * Created by gorobec on 08.10.16.
 */
public class Student implements Comparable<Student>{

    private String name;
    private String surname;
    private double averageMark;

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
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;


        if(name != null){
            boolean answer =  name.equals(student.name);
            if(!answer) return false;
        }


        return surname != null ? surname.equals(student.surname) : student.surname == null;

    }

    @Override
    public int compareTo(Student o) {

        int answer = name.compareTo(o.name);
        if(answer != 0) return answer;
        return surname.compareTo(o.surname);

    }
}
