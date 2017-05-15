package wargame;

import junit.framework.TestCase;

/**
 * Tests the Player class functionality
 */
public class PlayerTest extends TestCase{

    public void testGetName() {
        String name = "bob";
        Player player= new Player(name);
        assertEquals("The player name did not match", name, player.getName());
    }

    public void testGetCardCount() {
        Card card = new Card(Suit.CLUB, 1);
        Player player = new Player("Bob");
        assertEquals("New player did not have an empty hand", 0, player.getCardCount());
        player.addCard(card);
        assertEquals("Incorrect player card count", 1, player.getCardCount());
    }

    public void testAddCard() {
        Card c1 = new Card(Suit.CLUB, 1);
        Card c2 = new Card(Suit.CLUB, 2);
        Player player = new Player("Bob");
        player.addCard(c1);
        player.addCard(c2);
        assertEquals("Incorrect player card count", 2, player.getCardCount());
    }

    public void testRemoveCard() {
        Card c1 = new Card(Suit.CLUB, 1);
        Card c2 = new Card(Suit.CLUB, 2);
        Player player = new Player("Bob");
        player.addCard(c1);
        player.addCard(c2);
        Card nc1 = player.removeCard();
        Card nc2 = player.removeCard();
        // Expects the first one added to be the first one removed
        assertEquals("Incorrect card order", c1, nc1);
        assertEquals("Incorrect card order", c2, nc2);
    }

    public void testRemoveCardWhenEmpty() {
        Player player = new Player("Bob");
        Card card = player.removeCard();
        // Expects the first one added to be the first one removed
        assertNull("Incorrect card order", card);
    }

}