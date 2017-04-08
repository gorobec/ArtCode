package week2.day1;

import java.util.Arrays;

/**
 * Created by gorobec on 08.04.17.
 */
public class Manager extends Employee{

    private Employee[] employees;
    private int counter;


    public Manager(String name, String surname, int age, int employesSize){
        super(name, surname, age);
        employees = new Employee[employesSize];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String toString(){
        return String.format("%s, employees: %s", super.toString(), Arrays.toString(employees));
    }

    public boolean addEmployee(Employee employee){
        if(employee == null) return false;
        if(counter == employees.length || contains(employees, employee)) return false;
        employees[counter++] = employee;
        return true;
    }

    private boolean contains(Employee[] employees, Employee employee) {
        for (int i = 0; i < counter; i++) {
            if (employees[i].getName().equals(employee.getName())
                    && employees[i].getSurname().equals(employee.getSurname())) {
                return true;

            }
        }
        return false;
    }

    public boolean removeEmployee(Employee employee) {
        if(employee == null) return false;
        int position = findPosition(employee);
        if(position == -1) {
            return false;
        } else {
/*public static native void arraycopy(Object src,  int  srcPos,
                            Object dest, int destPos,
                            int length);*/
            System.arraycopy(employees, position + 1, employees, position, counter - position - 1);
            counter--;
            return true;
        }
    }

    private int findPosition(Employee employee) {
        for (int i = 0; i < counter; i++) {
            if (employees[i].getName().equals(employee.getName())
                    && employees[i].getSurname().equals(employee.getSurname())) {
                return i;

            }
        }
        return -1;
    }

    public Employee find(Employee employee) {
        for (int i = 0; i < counter; i++) {
            if (employees[i].getName().equals(employee.getName())
                    && employees[i].getSurname().equals(employee.getSurname())) {
                return employees[i];

            }
        }
        return null;
    }

    public void showEmployee(){
        for (int i = 0; i < counter; i++) {
            System.out.println(employees[i].toString());
        }
    }

    @Override
    public void work() {
        System.out.println("I'm manager and I make others to work");
        for (int i = 0; i < counter; i++) {
            if(employees[i] instanceof Coder) {
                Coder coder = (Coder) employees[i];
                coder.work();
            } else {
                employees[i].work();
            }
        }
    }
}
