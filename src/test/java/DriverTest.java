import Player.Player;
import Deck.Deck.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Player player;
    Player dealer;

    @Before
    public void myTestSetUp(){
        player = new Player("player");
        dealer = new Player("dealer");
    }

    @Test
    public void checkWinner() {
        // player wins
        player.addCard(new Card("Spade", "A"));
        player.addCard(new Card("Spade", "K"));
        dealer.addCard(new Card("Heart", "3"));
        dealer.addCard(new Card("Diamond", "10"));
        assertTrue(player.getScore() > dealer.getScore());

        player.getHand().clear();
        dealer.getHand().clear();
        //player loses
        player.addCard(new Card("Spade", "K"));
        player.addCard(new Card("Spade", "10"));
        dealer.addCard(new Card("Heart", "Q"));
        dealer.addCard(new Card("Diamond", "J"));
        assertEquals(player.getScore(),dealer.getScore());

        player.getHand().clear();
        dealer.getHand().clear();
        // player loses
        player.addCard(new Card("Spade", "2"));
        player.addCard(new Card("Spade", "3"));
        dealer.addCard(new Card("Heart", "9"));
        dealer.addCard(new Card("Diamond", "A"));
        assertFalse(player.getScore()>dealer.getScore());

    }

}