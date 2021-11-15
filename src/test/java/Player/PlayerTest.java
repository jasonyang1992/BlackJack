package Player;

import Deck.Deck;
import Deck.Deck.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

   private Deck d;
   private Player player;

    @Before
    public void myTestSetUp(){
       d = new Deck(false);
       player = new Player("Player");
    }

    @Test
    public void addCard() {
        assertEquals(new Card("Spade", "A").getValue(), d.getCard().getValue());
        assertEquals(new Card("Spade", "2").getSuit(), d.getCard().getSuit());
        assertEquals(new Card("Spade", "3").getValue(), d.getCard().getValue());
    }

    @Test
    public void getHand() {
        player.addCard(new Card ("Spade", "A"));
        assertEquals(new Card("Spade", "A").getValue(), player.getHand().get(0).getValue());
        player.addCard(new Card ("Spade", "5"));
        assertEquals(new Card("Spade", "5").getValue(), player.getHand().get(1).getValue());
    }
}