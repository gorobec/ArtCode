package week3.circus;

public class Handler extends Artist {
    public Handler(String name, int age) {
        super(name, age);
    }

    @Override
    public void acting() {
        System.out.println("Put head in lion's mouth...");
        this.setActionTimes(this.getActionTimes() + 1);
    }
}
