package tic_tac_toe;

import java.util.Scanner;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        char lastMove;

        char[][] field = FieldUtils.createEmptyField();
        PrintUtils.printField(field);

        Scanner sc = new Scanner(System.in);

        while (true) {

            while (true) {
                System.out.println("Make your move: ");
                int cell = sc.nextInt();
                if (cell < 1 || cell > 9) {
                    System.out.println("Wrong input value!");
                    continue;
                }

                if (!FieldUtils.isCellEmpty(field, cell)) {
                    System.out.println("Cell is not empty!");
                    continue;
                }

                FieldUtils.makePlayerMove(field, cell);
                lastMove = 'X';
                break;
            }

            PrintUtils.printField(field);
            if(FieldUtils.checkWin(field)) break;
            System.out.println("Computer moving...");
            Thread.sleep(1500);
            FieldUtils.makeComputerMove(field);
            lastMove = '0';
            PrintUtils.printField(field);
            if(FieldUtils.checkWin(field)) break;
        }

        PrintUtils.printGameResult(lastMove);
    }
}
