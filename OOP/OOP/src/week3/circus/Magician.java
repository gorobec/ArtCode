package week3.circus;

public class Magician extends Artist {
    public Magician(String name, int age) {
        super(name, age);
    }

    @Override
    public void acting() {
        System.out.println("Making code...");
        this.setActionTimes(this.getActionTimes() + 1);
    }
}