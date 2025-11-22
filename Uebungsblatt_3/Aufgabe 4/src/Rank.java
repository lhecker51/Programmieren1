public enum Rank {
    ACE("Ace of"), //Ass
    TWO("Two of"), //Zwei
    THREE("Three of"), //Drei
    FOUR("Four of"), //Vier
    FIVE("Five of"), //Fünf
    SIX("Six of"), //Sechs
    SEVEN("Seven of"), //Sieben
    EIGHT("Eight of"), //Acht
    NINE("Nine of"), //Neun
    TEN("Ten of"), //Zehn
    JACK("Jack of"), //Bube
    QUEEN("Queen of"), //Dame
    KING("King of"); //König

    public final String description;

    private Rank(String description) {
        this.description = description;
    }

    static Rank fromInt(int rankNr) {
        return switch (rankNr) {
            case 1 -> Rank.ACE;
            case 2 -> Rank.TWO;
            case 3 -> Rank.THREE;
            case 4 -> Rank.FOUR;
            case 5 -> Rank.FIVE;
            case 6 -> Rank.SIX;
            case 7 -> Rank.SEVEN;
            case 8 -> Rank.EIGHT;
            case 9 -> Rank.NINE;
            case 10 -> Rank.TEN;
            case 11 -> Rank.JACK;
            case 12 -> Rank.QUEEN;
            case 13 -> Rank.KING;
            default -> null;
        };
    }

    public String toString() {
        return description;
    }

}
