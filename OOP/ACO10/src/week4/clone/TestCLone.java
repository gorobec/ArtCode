package week4.clone;


public class TestCLone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Child child = new Child("Oggy", 12);
        Woman wife = new Woman("Elena", 33, child);
        Man man = new Man("Andrew", 37, wife);
        System.out.println(man);
        Man clone = man.clone();
        System.out.println(clone);
        child.setName("Yura");
        System.out.println("After change mans child name");
        System.out.println(man);
        System.out.println(clone);
        man.setName("Dima");
        System.out.println("After change mans name");
        System.out.println(man);
        System.out.println(clone);

    }
}
