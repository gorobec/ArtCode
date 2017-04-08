package week2.day1;

/**
 * Created by gorobec on 08.04.17.
 */
public class TestCompany {
    public static void main(String[] args) {
        Employee employee = new Junior("John", "Smith", 25, "Java");
        Employee junior = new Junior("Ann", "Smith", 15, "Java");
        Employee middle = new Middle("Dan", "Smith", 35, "Java");
        Employee senior = new Senior("David", "Smith", 45, "Java");


        Manager manager = new Manager("David", "Smith", 45, 5);
        System.out.println(manager.toString());

        System.out.println("Adding ...");
        manager.addEmployee(employee);
        manager.addEmployee(junior);
        manager.addEmployee(middle);
        manager.addEmployee(senior);

        manager.showEmployee();
        System.out.println(manager.toString());


        /*Employee find = manager.find(junior);
//        if(find instanceof Coder){
        if(find.getClass() == Junior.class){
            Junior jun = (Junior) find;
            jun.code();
        }*/

        manager.work();

        manager.getEmployees()[1].setName("Jim");

        System.out.println(junior);

    }
}
