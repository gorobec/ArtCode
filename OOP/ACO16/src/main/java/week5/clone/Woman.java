package week5.clone;

/**
 * Created by gorobec on 05.11.16.
 */
public class Woman extends Person{
    private Child child;

    public Woman(String name, int age) {
        super(name, age);
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Woman{" +
                ", child=" + child +
                "} " + super.toString();
    }

    @Override
    public Woman clone() throws CloneNotSupportedException {

        Woman woman = (Woman) super.clone();
        woman.setChild((Child) child.clone());
        return woman;
    }
}
