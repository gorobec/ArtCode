import java.util.Scanner;

public class Game_01_homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pcnum = (int) (25 + Math.random() * (125 - 25));
        int counter = 0;
        int usnum;

        do {
            System.out.println("Enter Your number :");
            usnum = scan.nextInt();
            if (usnum < pcnum)
                System.out.println("Ваше число меньше");
            else if (usnum > pcnum)
                System.out.println("Ваше число больше");
            counter++;
        }
        while (usnum != pcnum && counter < 5);
        if (pcnum == usnum) {
            System.out.println("You win !");
        } else {
            System.out.println("You Lose !");
        }

    }
}
