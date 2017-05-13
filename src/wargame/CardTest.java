package wargame;

import junit.framework.TestCase;

/**
 * Class to test Card Class
 */
public class CardTest extends TestCase{

    public void testGetSuit()  {
        Card card = new Card(Suit.HEART, 1);
        assertEquals("Card had the wrong suit", Suit.HEART, card.getSuit());
    }

    public void testGetValue()  {
        int value = 1;
        Card card = new Card(Suit.HEART, value);
        assertEquals("Card had the wrong suit", value, card.getValue());
    }

    public void testToString()  {
        Card card = new Card(Suit.HEART, 1);
        assertEquals("Card had the wrong suit", "A|HEART", card.toString());
    }

    public void testCreateCardWithNegativeValue()  {
        try {
            new Card(Suit.HEART, -1);
            assertTrue("Should have thrown an exception", false);
        } catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

    public void testCreateCardWithTooHighValue()  {
        try {
            new Card(Suit.HEART, 14);
            assertTrue("Should have thrown an exception", false);
        } catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

}