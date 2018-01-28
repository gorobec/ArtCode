package tic_tac_toe;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class FieldUtils {

    public static char[][] createEmptyField() {
        char[][] field = new char[3][];

        field[0] = new char[]{'1', '2', '3'};
        field[1] = new char[]{'4', '5', '6'};
        field[2] = new char[]{'7', '8', '9'};

        return field;
    }

    public static boolean isCellEmpty(char[][] field, int cell) {

        int row = (cell - 1) / 3;
        int column = (cell - 1) % 3;

        return field[row][column] != 'X' && field[row][column] != '0';
    }

    public static void makePlayerMove(char[][] field, int cell) {
        makeMove(field, cell, 'X');
    }

    public static void makeComputerMove(char[][] field) {

        while (true) {
            int cell = (int) (1 + Math.random() * (9 - 1));
            if (isCellEmpty(field, cell)) {
                makeMove(field, cell, '0');
                return;
            }
        }
    }

    private static void makeMove(char[][] field, int cell, char symbol) {
        int row = (cell - 1) / 3;
        int column = (cell - 1) % 3;

        field[row][column] = symbol;
    }

    public static boolean checkWin(char[][] field) {

        int row = 0;
        int column = 0;

        return (field[row][column] == field[row][column + 1] && field[row][column + 1] == field[row][column + 2]) ||
                (field[row + 1][column] == field[row + 1][column + 1] && field[row + 1][column + 1] == field[row + 1][column + 2]) ||
                (field[row + 2][column] == field[row + 2][column + 1] && field[row + 2][column + 1] == field[row + 2][column + 2]) ||
                (field[row][column] == field[row + 1][column + 1] && field[row + 1][column + 1] == field[row + 2][column + 2]) ||
                (field[row][column] == field[row + 1][column] && field[row + 1][column] == field[row + 2][column]) ||
                (field[row][column + 1] == field[row + 1][column + 1] && field[row + 1][column + 1] == field[row + 2][column + 1]) ||
                (field[row][column + 2] == field[row + 1][column + 2] && field[row + 1][column + 2] == field[row + 2][column + 2]) ||
                (field[row][column + 2] == field[row + 1][column + 1] && field[row + 1][column + 1] == field[row + 2][column]);


    }
}
