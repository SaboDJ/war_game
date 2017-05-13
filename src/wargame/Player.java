package wargame;

import java.util.ArrayList;

/**
 * Class to contain a player
 */
public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    /**
     * Constructor
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @returns the name of the player
     */
    public String getName() {
        return this.name;
    }

    /**
     * @returns the number of cards in the hand
     */
    public int getCardCount(){
        return hand.size();
    }

    /**
     * Adds a card to the back of the hand
     * @param card the card which is added
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Removes a card from the front of the hand
     * @returns a card or null if the hand is empty
     */
    public Card removeCard() {
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }
}
