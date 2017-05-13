package wargame;

import junit.framework.TestCase;

/**
 * Class to test Deck Class
 */
public class DeckTest extends TestCase {

    public void testGetSize() {
        assertEquals("Expected Deck size to equal 52", new Deck().getSize(), 52);
    }

    public void testShuffle() {
        Deck deck = new Deck();
        boolean result = deck.toString().contains("A|HEART, 2|HEART, 3|HEART, 4|HEART, 5|HEART, 6|HEART, " +
                "7|HEART, 8|HEART, 9|HEART, 10|HEART, J|HEART, Q|HEART, K|HEART, A|CLUB, 2|CLUB, 3|CLUB, 4|CLUB, 5|CLUB, 6|CLUB, 7|CLUB, " +
                "8|CLUB, 9|CLUB, 10|CLUB, J|CLUB, Q|CLUB, K|CLUB, A|DIAMOND, 2|DIAMOND, 3|DIAMOND, 4|DIAMOND, 5|DIAMOND, 6|DIAMOND, 7|DIAMOND, " +
                "8|DIAMOND, 9|DIAMOND, 10|DIAMOND, J|DIAMOND, Q|DIAMOND, K|DIAMOND, A|SPADE, 2|SPADE, 3|SPADE, 4|SPADE, 5|SPADE, 6|SPADE, " +
                "7|SPADE, 8|SPADE, 9|SPADE, 10|SPADE, J|SPADE, Q|SPADE, K|SPADE");
        assertTrue("Invalid String output", result);

        deck.shuffle();
        result = deck.toString().contains("A|HEART, 2|HEART, 3|HEART, 4|HEART, 5|HEART, 6|HEART, " +
                "7|HEART, 8|HEART, 9|HEART, 10|HEART, J|HEART, Q|HEART, K|HEART, A|CLUB, 2|CLUB, 3|CLUB, 4|CLUB, 5|CLUB, 6|CLUB, 7|CLUB, " +
                "8|CLUB, 9|CLUB, 10|CLUB, J|CLUB, Q|CLUB, K|CLUB, A|DIAMOND, 2|DIAMOND, 3|DIAMOND, 4|DIAMOND, 5|DIAMOND, 6|DIAMOND, 7|DIAMOND, " +
                "8|DIAMOND, 9|DIAMOND, 10|DIAMOND, J|DIAMOND, Q|DIAMOND, K|DIAMOND, A|SPADE, 2|SPADE, 3|SPADE, 4|SPADE, 5|SPADE, 6|SPADE, " +
                "7|SPADE, 8|SPADE, 9|SPADE, 10|SPADE, J|SPADE, Q|SPADE, K|SPADE");
        assertFalse("Shuffle Failed", result);

    }

    public void testToStringTest() {
        String expected = "Deck{cards=[A|HEART, 2|HEART, 3|HEART, 4|HEART, 5|HEART, 6|HEART, " +
                "7|HEART, 8|HEART, 9|HEART, 10|HEART, J|HEART, Q|HEART, K|HEART, A|CLUB, 2|CLUB, 3|CLUB, 4|CLUB, 5|CLUB, 6|CLUB, 7|CLUB, " +
                "8|CLUB, 9|CLUB, 10|CLUB, J|CLUB, Q|CLUB, K|CLUB, A|DIAMOND, 2|DIAMOND, 3|DIAMOND, 4|DIAMOND, 5|DIAMOND, 6|DIAMOND, 7|DIAMOND, " +
                "8|DIAMOND, 9|DIAMOND, 10|DIAMOND, J|DIAMOND, Q|DIAMOND, K|DIAMOND, A|SPADE, 2|SPADE, 3|SPADE, 4|SPADE, 5|SPADE, 6|SPADE, " +
                "7|SPADE, 8|SPADE, 9|SPADE, 10|SPADE, J|SPADE, Q|SPADE, K|SPADE]}";
        assertEquals("Invalid String output", expected, new Deck().toString() );
    }

    public void testGetCardValid(){
        assertEquals("Didn't get a card", "A|HEART", new Deck().getCard().toString());
    }

    public void testGetCardEmptyDeck(){
        Deck deck = new Deck();
        while(deck.getSize() != 0){
            deck.getCard();
        }
        assertNull("Should have returned a null", deck.getCard());
    }

    public void testAddCardValid(){
        assertTrue("Failed to add a card", new Deck().addCard(new Card(Suit.CLUB,1)));
    }

    public void testAddCardNull(){
        assertFalse("Should have failed adding", new Deck().addCard(null));
    }

}