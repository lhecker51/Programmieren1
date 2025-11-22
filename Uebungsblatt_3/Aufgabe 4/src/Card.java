import java.util.Random;

public class Card {
    private final Rank rank;
    private final Suit suit;
    private static final Random randomGenerator = new Random();

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String name() {
        String germanRank = switch (rank.description) {
            case "Ace of" -> "Ass";
            case "Two of" -> "Zwei";
            case "Three of" -> "Drei";
            case "Four of" -> "Vier";
            case "Five of" -> "Fünf";
            case "Six of" -> "Sechs";
            case "Seven of" -> "Sieben";
            case "Eight of" -> "Acht";
            case "Nine of" -> "Neun";
            case "Ten of" -> "Zehn";
            case "Jack of" -> "Bube";
            case "Queen of" -> "Dame";
            case "King of" -> "König";
            default -> rank.description;
        };

        String germanSuit = switch (suit.name()) {
            case "SPADE" -> "Kreuz";
            case "CLUB" -> "Pik";
            case "HEART" -> "Herz";
            case "DIAMOND" -> "Karo";
            default -> suit.name();
        };

        return germanSuit + " " +  germanRank;
    }

    public static Card random() {
        Rank rank = Rank.fromInt(randomGenerator.nextInt(1,14));
        Suit suit = Suit.fromInt(randomGenerator.nextInt(1, 5));
        return new Card(rank, suit);
    }

    @Override
    public String toString() {
        return rank.description + " " + suit.description;
    }
}
