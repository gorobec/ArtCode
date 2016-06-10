package week1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GroupFactory {
    public GroupStudents createGroup(String filePath){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            try {
                return (GroupStudents)ois.readObject();
            } catch (ClassNotFoundException e) {
                return new GroupStudents();
            }
        } catch (IOException e) {
            return new GroupStudents();
        }
    }
}
