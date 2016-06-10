package week2.serviceCentre;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Employee {
    private List<Repairer> repairers = new ArrayList<>();
    public Administrator(String name, String password) {
        super(name, password);
    }
}
