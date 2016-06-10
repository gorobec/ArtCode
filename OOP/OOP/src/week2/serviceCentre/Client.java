package week2.serviceCentre;

import java.util.ArrayList;
import java.util.List;


public class Client extends Person{
    private static long id = 1;
    private List<Technic> technics = new ArrayList<>();

    public Client(String name, String password) {
        super(name, password);
    }
}

