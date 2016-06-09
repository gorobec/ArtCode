package week5.day2.iterator;


public class ArtCode {
    public static void main(String[] args) {
        SergijGroup sergijGroup = new SergijGroup();
        VitalikGroup vitalikGroup = new VitalikGroup();
        YevhenGroup yevhenGroup = new YevhenGroup();
        Journal journal = new Journal(sergijGroup, vitalikGroup, yevhenGroup);
        journal.showStudents();

    }
}
