package week2.serviceCentre;

abstract class Person {
    private String name;
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return name;
    }
}
