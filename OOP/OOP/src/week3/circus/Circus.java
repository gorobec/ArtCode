package week3.circus;

import java.io.Serializable;
import java.util.ArrayList;

public class Circus implements Serializable {

    private String location;
    private String name;

    public Circus(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
