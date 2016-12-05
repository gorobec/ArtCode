package week2.day1.inheritance;

import java.util.Objects;

/**
 * Created by gorobec on 28.05.16.
 */
public class Manager extends Employee {

    private Employee[] employees;

    public Manager(int age, String name, String surname, Employee[] employees) {
        super(age, name, surname);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("I make people work");

        /*for (Coder coder : coders) {
            coder.work();
        }

        for (QA tester : testers) {
            tester.work();
        }*/

        for (Employee employee : employees) {
            if(employee != null) {
                employee.work();
                if(employee instanceof Coder){
                    Coder tmp = (Coder)employee;
                    tmp.writeCode();
                }
            }


        }

    }
}
