package Working_With_Abstraction_Exercise.Card_Suit_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (CardSuits suit : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    suit.getValue(),
                    suit.toString()); //suit.ordinal()
        }

    }
}