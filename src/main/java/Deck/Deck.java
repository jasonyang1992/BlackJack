package Deck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public static class Card{

        private final String suit;
        private final String value;

        public Card(String suit, String value){
            this.suit = suit;
            this.value = value;
        }

        public String getSuit(){
            return suit;
        }

        public String getValue(){
            return value;
        }
    }

    private final ArrayList<Card> deck = new ArrayList<>();

    public Deck(boolean shuffle){
        // Add Cards
        final String[] CARDVALUE = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String s : CARDVALUE) {
            deck.add(new Card("Spade", s));
        }
        for (String s : CARDVALUE) {
            deck.add(new Card("Diamond", s));
        }
        for (String s : CARDVALUE) {
            deck.add(new Card("Clover", s));
        }
        for (String s : CARDVALUE) {
            deck.add(new Card("Heart", s));
        }
        // Shuffle Cards
        if(shuffle) {
            Collections.shuffle(deck);
        }
    }

    public Card getCard(){
        return deck.remove(0);
    }
}
