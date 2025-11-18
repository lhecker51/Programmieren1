public enum BoxState {
    EMPTY,
    X,
    O;

    public String getBoxState() {
        return switch (this) {
            case X -> "X";
            case O -> "O";
            case EMPTY -> " ";
        };
    }

    public static BoxState getBoxState(String boxState) {
        return switch (boxState) {
            case "X" -> BoxState.X;
            case "O" -> BoxState.O;
            case " " -> BoxState.EMPTY;
            default -> throw new IllegalStateException("Unexpected value: " + boxState);
        };
    }
}
