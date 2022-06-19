package Working_With_Abstraction_Exercise.Cards_With_Power_03;

public class Card {
    private CardSuits cardSuits;
    private CardRanks cardRanks;
    private int power;

    public Card(CardSuits cardSuits, CardRanks cardRanks) {
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;
    }

    public int getPower() {
        return this.cardSuits.getValue() + this.cardRanks.getValue();
    }
}