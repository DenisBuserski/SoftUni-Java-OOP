package Working_With_Abstraction_Exercise.Cards_With_Power_03;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int value;

    CardSuits(int  value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}