package week1;

import java.util.Scanner;

public class _09BankTask {
    public static void main(String[] args) {

//       create scanner
        Scanner worker = new Scanner(System.in);

        System.out.println("Enter name");
        String clientName = worker.nextLine(); //read String

        System.out.println("Enter deposit");
        double deposit = worker.nextDouble();//read double

        System.out.println("Enter percent");
        double percent = worker.nextDouble();//read double

        System.out.println("Enter month count");
        int month = worker.nextInt();//read int

        double bonus = 500;

        if (month > 36) { // condition
            deposit = deposit * percent + deposit; // logic

            deposit += bonus;
        }
//      if previous condition isn't correct we check next condition
        else if (month > 12){ // condition
            deposit = deposit * percent + deposit;  // logic
//       if all condition aren't correct we make next logic
        } else {
            System.out.println("Message");  // logic
        }
//     This logic is not included in the unit test and will be fulfilled in any case,
        System.out.println("You have " + deposit + " uah on yours account.");


    }
}
