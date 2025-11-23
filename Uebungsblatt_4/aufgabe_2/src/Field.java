import java.util.Arrays;

public class Field {

    private BoxState[][] field = new BoxState[3][3];

    public Field() {

        for (BoxState[] boxStates : field) {
            Arrays.fill(boxStates, BoxState.EMPTY);
        }
    }

    public boolean setBox(Player currentPlayer, int row, int col) {
        if (isEmpty(row, col)) {
            field[row][col] = BoxState.getBoxState(currentPlayer.getName());
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty(int row, int col) {
        return field[row][col] == BoxState.EMPTY;
    }

    public String toSting() {
        StringBuilder output = new StringBuilder("  1 2 3");
        for (int i = 0; i < field.length; i++) {
            String line = i+1 + " " + field[i][0].getBoxState() + " " + field[i][1].getBoxState() + " " + field[i][2].getBoxState();
            output.append("\n").append(line);
        }
        return output.toString();
        }

        public boolean checkDiagonals(Player cuyrrentPlayer) {
            String playerName = cuyrrentPlayer.getName();
            return (field[0][0] == BoxState.getBoxState(playerName) &&
                    field[1][1] == BoxState.getBoxState(playerName) &&
                    field[2][2] == BoxState.getBoxState(playerName))
                    || (field[0][2] == BoxState.getBoxState(playerName) &&
                    field[1][1] == BoxState.getBoxState(playerName) &&
                    field[2][0] == BoxState.getBoxState(playerName));
        }

        public boolean checkRow(Player currentPlayer, int row) {
            String playerName = currentPlayer.getName();
            return field[row][0] == BoxState.getBoxState(playerName) &&
                    field[row][1] == BoxState.getBoxState(playerName) &&
                    field[row][2] == BoxState.getBoxState(playerName);
        }

        public boolean checkCol(Player currentPlayer, int col) {
            String playerName = currentPlayer.getName();
            return field[0][col] == BoxState.getBoxState(playerName) &&
                    field[1][col] == BoxState.getBoxState(playerName) &&
                    field[2][col] == BoxState.getBoxState(playerName);
        }

        public boolean isFull() {
            for (BoxState[] boxStates : field) {
                for (BoxState boxState : boxStates) {
                    if (boxState != BoxState.EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
