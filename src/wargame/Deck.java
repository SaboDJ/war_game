package wargame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Manages a single deck
 */
public class Deck {
    private ArrayList<Card> cards;


    /**
     * Creates a new deck
     */
    public Deck(){
        cards = new ArrayList<>();
        // Loops over each suit
        for(Suit suit : Suit.values()){
            // Creates cards Ace through king
            for(int i = 1; i < 14; i++ ){
                cards.add(new Card(suit, i));
            }
        }
    }

    /**
     * @returns the number of cards in the deck
     */
    public int getSize(){
        return cards.size();
    }

    /**
     * Shuffles the deck
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }

    /**
     * @returns the card from the head of the deck or null if empty deck
     */
    public Card getCard(){
        if(cards.isEmpty()){
            return null;
        }
        return cards.remove(0);
    }

    /**
     * Adds a card to the bottom end of the deck
     * @return true if stressful, false if not
     */
    public boolean addCard(Card card){
        return card !=null && cards.add(card);
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}