package week2.serviceCentre;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    private List<Employee> employees = new ArrayList<>();
    public Director(String name, String password) {
        super(name, password);
    }
}
