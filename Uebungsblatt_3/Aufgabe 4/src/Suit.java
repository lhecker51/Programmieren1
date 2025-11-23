public enum Suit {
    SPADE("Spades"), //Kreuz
    CLUB("Clubs"), //Pik
    HEART("Hearts"), //Herz
    DIAMOND("Diamonds"); //Karo

    public final String description;

    private Suit(String description) {
        this.description = description;
    }

    static Suit fromInt(int suitNr) {
        switch (suitNr) {
            case 1:
                return Suit.SPADE;
            case 2:
                return Suit.CLUB;
            case 3:
                return Suit.HEART;
            case 4:
                return Suit.DIAMOND;
            default:
                return null;
        }
    }

    public String toString(Suit suit) {
        return suit.description;
    }
}
