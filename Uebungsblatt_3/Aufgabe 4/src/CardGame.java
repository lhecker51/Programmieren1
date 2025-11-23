public class CardGame {
    static void main() {
        System.out.println("Generated cards:");

        Card[] cards = new Card[10];
        for (Card card:cards) {
            card = Card.random();
            System.out.println(card.toString() + " --> " + card.name());
        }
    }
}
