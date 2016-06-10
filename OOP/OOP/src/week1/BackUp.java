package week1;

import java.io.*;

public class BackUp {
    private static final String   FILENAME = "src/week1/group.txt";

    public static void save (GroupStudents group) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FILENAME));

        } catch (IOException e) {
            try {
                new File(FILENAME).createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
            oos.writeObject(group);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
