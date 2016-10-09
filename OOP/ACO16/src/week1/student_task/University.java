package week1.student_task;

import java.util.Arrays;

/**
 * Created by gorobec on 09.10.16.
 */
public class University {
    private String name;
    private Group[] groups;
    private int groupCount;

    public University(String name, int groupSize) {
        this.name = name;
        this.groups = new Group[groupSize];
    }


    public boolean addGroup(Group group){
        if(groupCount == groups.length || group == null) return false;
        groups[groupCount] = group;
        groupCount++;
        return true;
    }

    public void showGroups(){
        for (int i = 0; i < groupCount; i++) {
            System.out.printf("%d. - %s\n", i + 1, groups[i].getName());
        }
    }

    public void showStudents(){
        for (int i = 0; i < groupCount; i++) {
            groups[i].showStudents();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group[] getGroups() {
        return groups;
    }

    public int getGroupCount() {
        return groupCount;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
