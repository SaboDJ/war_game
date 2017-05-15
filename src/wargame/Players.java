package wargame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Stores and manages a group of players.
 */
public class Players {
    ArrayList<Player> players = new ArrayList<>();


    /**
     * Creates a group of players. Takes user input to get the number of players to create.
     */
    public void createPlayers() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many players?: ");
        try {
            String countString = reader.readLine();
            int count = Integer.valueOf(countString);
            if (count < 2 || count > 10) {
                System.out.println("Number of players must be between 2 and 10 inclusive");
                createPlayers();
            }
            else {
                for (int i = 0; i < count; i++){
                    createPlayer();
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error: invalid input. " + e.getMessage());
            createPlayers();
        }
    }

    /**
     * Creates a single player and adds it to the players array. Uses user input to get the players name
     */
    public void createPlayer() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = players.size() + 1;
        System.out.println("Enter the name of player " + num + ": ");
        try {
            String name = reader.readLine();
            if (name.length() == 0) {
                System.out.println("Name cannot be blank");
                createPlayer();
            }
            else {
                players.add(new Player(name));
            }
        }
        catch (IOException e) {
            System.out.println("Error: invalid input. " + e.getMessage());
            createPlayer();
        }
    }

    /**
     * @return returns the player count
     */
    public int getCount() {
        return players.size();
    }

    /**
     * Gets a player at a specific index.
     * @param index the player number to get
     * @return a player or null if the index is out of range
     */
    public Player getPlayer(int index) {
        if (players.isEmpty() || index > players.size()) {
            return null;
        }
        return players.get(index);
    }
}
