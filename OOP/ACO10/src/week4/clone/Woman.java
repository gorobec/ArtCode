package week4.clone;


public class Woman extends Person{
    private Child child;

    public Woman(String name, int age, Child child) {
        super(name, age);
        this.child = child;
    }

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
    protected Woman clone() throws CloneNotSupportedException {
        return new Woman(getName(), getAge(), child.clone());
    }

    @Override
    public String toString() {
        return String.format(" name - %s, age - %d, child %s", getName(), getAge(), child);
    }
}
