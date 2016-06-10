package week3.circus;

public class Clown extends Artist {

    public Clown(String name, int age) {
        super(name, age);
    }

    @Override
    public void acting() {
        System.out.println("Making jokes...");
        this.setActionTimes(this.getActionTimes() + 1);
    }
}
