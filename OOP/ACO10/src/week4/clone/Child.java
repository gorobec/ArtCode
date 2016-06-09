package week4.clone;


public class Child extends Person{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected Child clone() throws CloneNotSupportedException {
        return new Child(getName(), getAge());
    }

    @Override
    public String toString() {
        return
                "name - '" + getName() + '\'' +
                ", age - " + getAge();
    }
}
