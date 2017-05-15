package wargame;

import java.util.ArrayList;

/**
 * Main class that runs the game of War
 */
public class Game {

    public void run() {
        // create and setup the players
        Players players = new Players();
        players.createPlayers();
        // create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();
        // deal the players their cards evenly
        int toDeal = deck.getSize() - (deck.getSize() % players.getCount());
        for (int i = 0; i < toDeal; i++){
            int playerNumber = i % players.getCount();
            players.getPlayer(playerNumber).addCard(deck.getCard());
        }

    }



    public static void main(String[] args) {
        new Game().run();
    }
}
