package wargame;

import junit.framework.TestCase;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;
import static org.mockito.Mockito.*;

/**
 * Tests the Players class functionality
 */
public class PlayersTest extends TestCase {
    public void testCreatePlayers() {

        Players players = spy(Players.class);
        doNothing().when(players).createPlayer();

        String count = "3";
        ByteArrayInputStream in = new ByteArrayInputStream(count.getBytes());
        System.setIn(in);

        players.createPlayers();
        verify(players, times(Integer.valueOf(count))).createPlayer();
    }

    public void testCreatePlayer() {
        String name = "testname";
        ByteArrayInputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);

        Players players = new Players();
        players.createPlayer();

        assertEquals("Error: incorrect player count", 1, players.getCount());
        assertEquals("Error: incorrect player name", name, players.getPlayer(0).getName());
    }

    public void testCreatePlayerFail() {
        String name = "\nbob";
        ByteArrayInputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);

        Players players = new Players();
        players.createPlayer();

        assertEquals("Error: incorrect player count", 1, players.getCount());
    }

    public void testGetCount() {


    }

    public void testGetPlayer() {

    }

}