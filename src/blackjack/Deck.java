package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public class Card{
		String suit;
		String symbol;
		
		Card(String suit, String symbol){
			this.suit = suit;
			this.symbol = symbol;		
		}
		@Override
		public String toString() {
			return symbol + " " + suit;
		}
	}
	
	private ArrayList<Card>deck;
	private final String DECKSYM[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; // List of Symbols in the deck
	
	Deck(){
		deck = new ArrayList<Card>();
		
		for(int i  = 0; i < 12; i++) {
			deck.add(new Card("Spades", DECKSYM[i]));
		}
		for(int i  = 0; i < 12; i++) {
			deck.add(new Card("Diamonds", DECKSYM[i]));
		}
		for(int i  = 0; i < 12; i++) {
			deck.add(new Card("Hearts", DECKSYM[i]));
		}
		for(int i  = 0; i < 12; i++) {
			deck.add(new Card("Clovers", DECKSYM[i]));
		}
		Collections.shuffle(deck);
	}
	public Card getDraw() {
		return deck.get(0);
	}
	
	public Card draw() {
		return deck.remove(0);
	}
}
