package week1;

import java.util.Scanner;

public class Menu {


    private static Scanner sc = new Scanner(System.in);

    public static void startMenu(GroupStudents group){

        System.out.println("Hello, I'm your students data base\n");

        out:
        while(true){

            showMenu();

            String choose = sc.next();

            switch (choose){

                case "1":
                    addStudent(group);
                    break;
                case "2":
                    showAllStadent(group);
                    break;
                case "3":
                    deleteStudent(group);
                    break;
                case "4":
                    System.out.println("Goodbye");
                    break out;
                default:
                    System.out.println("Incorrect enter. Try again");
            }
        }
    }

    public static void showMenu(){

            System.out.println("Press 1-4 to choose your act");
            System.out.println("1. Add new student");
            System.out.println("2. Show all students");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");
    }


    private static void addStudent(GroupStudents group){

        Student stud = new Student();
        stud.init();
        group.addStudent(stud);
        BackUp.save(group);
        System.out.println("New student was added");
        System.out.println();

    }

    private static void showAllStadent(GroupStudents group){

        group.show();
        System.out.println();

    }

    private static void deleteStudent(GroupStudents group){

        System.out.println("Which student you want to remove?");
        int choose;

        while(true) {
            System.out.println("Enter number of the student");
            choose = CheckCorrectEnter.CheckInt(sc.next());
            if(choose != 0) break;
        }

        if(group.deleteStudent(choose))
            System.out.println("Student " + choose +" removed\n");
        else
            System.out.println("Can't find this student\n");

    }

}
