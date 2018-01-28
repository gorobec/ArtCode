package tic_tac_toe;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class PrintUtils {

    public static void printGreeting(){

    }

    public static void printGameResult(char symbol){
        System.out.println("Congratulations!!!");
        System.out.printf("%s wins!", symbol);
    }


    public static void printField(char[][] field) {
        System.out.println();
        System.out.printf(" %1s | %1s | %1s \n", field[0][0], field[0][1], field[0][2]);
        System.out.println(" ---------");
        System.out.printf(" %1s | %1s | %1s \n", field[1][0], field[1][1], field[1][2]);
        System.out.println(" ---------");
        System.out.printf(" %1s | %1s | %1s \n", field[2][0], field[2][1], field[2][2]);
        System.out.println();

    }
}
