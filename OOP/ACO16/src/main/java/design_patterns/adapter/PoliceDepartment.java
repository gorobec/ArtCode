package design_patterns.adapter;

import week2.day2.library.controller.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 06.11.16.
 */
public class PoliceDepartment {

    private List<Policeman> policemen = new ArrayList<>();

    public PoliceDepartment() {
    }

    public boolean hirePoliceman(Policeman policeman){
        return policemen.add(policeman);
    }

    public void startWorkingDay(){
        for (Policeman policeman : policemen) {
            policeman.serve();
        }
    }
}
