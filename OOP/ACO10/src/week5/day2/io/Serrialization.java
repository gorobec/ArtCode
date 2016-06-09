package week5.day2.io;


import week5.day2.iterator.Student;

import java.io.*;

public class Serrialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Oleg", 30, 5);
        File file = new File("/home/gorobec/Java/development/ACO10/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(student);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Student  clone =  (Student)ois.readObject();

        System.out.println(clone);
    }
}
