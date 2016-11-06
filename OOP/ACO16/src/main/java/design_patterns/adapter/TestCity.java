package design_patterns.adapter;

/**
 * Created by gorobec on 06.11.16.
 */
public class TestCity {
    public static void main(String[] args) {
        PoliceDepartment department = new PoliceDepartment();

        Policeman policeman = new Policeman();
        Policeman policeman2 = new Policeman();
        Policeman policeman3 = new Policeman();

        Militioner militioner = new Militioner();
        Militioner militioner2 = new Militioner();
        Militioner militioner3 = new Militioner();

        department.hirePoliceman(policeman);
        department.hirePoliceman(policeman2);
        department.hirePoliceman(policeman3);
        department.hirePoliceman(new PolicemanAdapter(militioner));
        department.hirePoliceman(new PolicemanAdapter(militioner2));
        department.hirePoliceman(new PolicemanAdapter(militioner3));

        department.startWorkingDay();
    }
}
