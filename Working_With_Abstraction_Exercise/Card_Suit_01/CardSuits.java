package Working_With_Abstraction_Exercise.Card_Suit_01;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int value;

    CardSuits(int  value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}