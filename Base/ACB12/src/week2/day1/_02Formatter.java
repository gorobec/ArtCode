package week2.day1;


public class _02Formatter {
    public static void main(String[] args) {
//        %[args_index$][flags][width][.precision]conversion
        String name  = "Vasja";
        long age = 158888;
        String name2 = "Nikolaj";
        int age2 = 18;
        double salary = 256676500.158989;

        /*System.out.println("Hello, my name is " + name + " I'm "
                            + age + " years old" +
                            " I earn " + salary + " $.");*/


//        System.out.printf("Hello, my name is %s %n I'm %d years old, I earn %.2f $", name, age, salary);

        /*System.out.println(name + " - " + age);
        System.out.println(name2 + " - " + age2);*/
        System.out.printf("%2$-10s - %1$-10d%n", age,name);
        System.out.printf("%-10s - %-10d", name2, age2);
       /* System.out.printf("%,.2f", salary);*/
    }
}
