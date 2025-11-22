import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    private static final Player[] players = new Player[]{new Player("X"), new Player("O")};
    private static final Field field = new Field();
    private static Player currentPlayer;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        currentPlayer = players[1];
        int row;
        int col;

        do {
            nextPlayer();
            System.out.println(field.toSting());
            System.out.println("It's Player " + currentPlayer.getName() + "s turn");


            while (true) {
                row = getInput("row") -1;
                col = getInput("col") -1;

                if (field.setBox(currentPlayer, row, col)) {
                    break;
                } else {
                    System.out.println("Not empty! Choose another one");
                }
            }
        } while (!isOver(row, col));
    }

    private static boolean isValidMove(int input) {
        return input > 0 && input < 4;
    }

    private static boolean isOver(int row, int col) {
        if (field.checkDiagonals(currentPlayer) || field.checkRow(currentPlayer, row) || field.checkCol(currentPlayer ,col)) {
            System.out.println(field.toSting());
            System.out.println("Player " + currentPlayer.getName() + " has won!");
            return true;
        } else if (field.isFull()) {
            System.out.println(field.toSting());
            System.out.println("It's a tie!");
            return true;
        } else {
            return false;
        }
    }

    private static void nextPlayer() {
        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else if (currentPlayer == players[1]) {
            currentPlayer = players[0];
        }
    }

    private static int getInput(String context) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            input = 0;
            try {
                System.out.print("Enter " + context + ": ");
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Must be an integer");
                continue;
            }

            if (isValidMove(input)) {
                validInput = true;
            } else {
                System.out.println("That is not a valid " + context + "!");
            }
        }
        return input;
    }
}
