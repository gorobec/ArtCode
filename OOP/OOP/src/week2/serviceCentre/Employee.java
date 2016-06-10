package week2.serviceCentre;


import java.util.ArrayList;
import java.util.List;

abstract class Employee extends Person{
    private List<Client> clients = new ArrayList<>();

    public Employee(String name, String password) {
        super(name, password);
    }
}
