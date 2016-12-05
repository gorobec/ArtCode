package week7;

import utils.MyDate;
import week1.day2.student.Gender;
import week1.day2.student.Student;

import java.io.*;

/**
 * Created by gorobec on 10.07.16.
 */
public class SerializationWithDataOutputStream {
    public static void main(String[] args) throws IOException {
        Student st1 = new Student("Alex",
                new MyDate(1977, 12, 12),
                Gender.MALE);


        ObjectOutputStream dos = new ObjectOutputStream(
                new FileOutputStream(
                        "/home/gorobec/Java/development/Teaching/ArtCode/ACO13/src/resources/Student.txt"));

        dos.writeObject(st1);
        dos.flush();
        dos.close();
    }
}
