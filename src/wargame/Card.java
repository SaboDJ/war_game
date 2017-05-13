package wargame;

/**
 * Class for a Card object. One a card is created the value and suit cannot be changed.
 */
public class Card {
    private Suit suit;
    private int value;

    /**
     * Constructor to create a new card
     * @param suit the cards suit
     * @param value the cards value
     */
    public Card(Suit suit, int value){
        this.suit = suit;
        if(value < 1 || value > 13){
            throw new IllegalArgumentException("Cards value must be between 1 and 13 inclusive");
        }
        this.value = value;
    }

    /**
     * @returns the cards suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @returns the cards value
     */
    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        String[] face = {"A", "2", "3", "4", "5", "6", "7",
                         "8", "9", "10", "J", "Q", "K"};
        return face[value-1] + "|" + suit.toString();
    }
}