package Working_With_Abstraction_Exercise.Card_Rank_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for (CardRanks value : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    value.getValue(),
                    value.toString());
        }

    }
}