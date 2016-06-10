package week1;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{

    private static Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String phone;
    private int rank;

    public void init(String name, int age, String phone, int rank){

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.rank = rank;

    }
    public void show(){

        System.out.print("Name student  -  " + name);
        System.out.print("   Age student   -  " + age);
        System.out.print("   Phone student -  " + phone);
        System.out.print("   Rank student  -  " + rank);

        System.out.println();

    }
    public void init(){

        System.out.print("Enter name   -  ");
        this.name = sc.next();

        while(true) {
            System.out.print("Enter age    -  ");
            this.age = CheckCorrectEnter.CheckInt(sc.next());
            if(this.age != 0) break;
        }


        System.out.print("Enter phone  -  ");
        this.phone = sc.nextLine();

        while(true) {
            System.out.print("Enter rank    -  ");
            this.rank = CheckCorrectEnter.CheckInt(sc.next());
            if(this.rank != 0) break;
        }

        System.out.println();

    }
    public Student copyStudenr(){

        Student temp = new Student();
        temp.age = this.age;
        temp.rank = this.rank;
        temp.name = this.name;
        temp.phone = this.phone;

        return temp;
    }

}
