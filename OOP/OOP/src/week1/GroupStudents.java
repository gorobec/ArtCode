package week1;

import java.io.Serializable;

public class GroupStudents implements Serializable{

    private Student[] group;
    private int Cur = 0;

    GroupStudents(int size){
        this.group = new Student[size];
    }

    GroupStudents(){
        this.group = new Student[3];
    }

    public void addStudent (Student stud){

        if(group.length == Cur){
           addMemory();
        }
        if(stud == null){
            System.err.println("Error");
        } else {
            group[Cur++] = stud;
        }
    }

    public void show(){

        System.out.println("All (" + Cur + ") Students");

        for (int i = 0; i < Cur; i++) {
            System.out.print(i+1 + ")  ");
            group[i].show();
        }

    }

    private void addMemory(){

        Student[] temp = new Student[group.length + 20];

        for (int i = 0; i < group.length ; i++) {
            temp[i] = group[i].copyStudenr();
        }

        group = temp;

    }

    public boolean deleteStudent(int index){

        if(index-1 > group.length) return false;

        Student[] temp = new Student[group.length];

        for (int i = 0, j = 0; j < Cur; ++j) {
            if(j != index-1)
            temp[i++] = group[j].copyStudenr();
        }
        this.group = temp;
        Cur--;


        return true;
    }

    public Student getStudentAt(int index){

        if(index > Cur)return null;

        return group[index];

    }

    public int lenght(){

        return Cur;

    }
}
