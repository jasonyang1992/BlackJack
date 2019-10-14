package blackjack;

public class FindValue {

	private int cardValue;
	
	public int getValue(String card, int pTotal) {
		
		if(card.equals("Ace Hearts") || card.equals("Ace Diamonds") || card.equals("Ace Spades") || card.equals("Ace Clovers")) {
			if (pTotal >= 11) {
				cardValue = 1;
			}
			else if (pTotal < 11) {
				cardValue = 11;
			}
		}
		else if (card.equals("Two Hearts") || card.equals("Two Diamonds") || card.equals("Two Spades") || card.equals("Two Clovers")) {
			cardValue = 2;
		}
		else if (card.equals("Three Hearts") || card.equals("Three Diamonds") || card.equals("Three Spades") || card.equals("Three Clovers")) {
			cardValue = 3;
		}
		else if (card.equals("Four Hearts") || card.equals("Four Diamonds") || card.equals("Four Spades") || card.equals("Four Clovers")) {
			cardValue = 4;
		}
		else if (card.equals("Five Hearts") || card.equals("Five Diamonds") || card.equals("Five Spades") || card.equals("Five Clovers")) {
			cardValue = 5;
		}
		else if (card.equals("Six Hearts") || card.equals("Six Diamonds") || card.equals("Six Spades") || card.equals("Six Clovers")) {
			cardValue = 6;
		}
		else if (card.equals("Seven Hearts") || card.equals("Seven Diamonds") || card.equals("Seven Spades") || card.equals("Seven Clovers")) {
			cardValue = 7;
		}
		else if (card.equals("Eight Hearts") || card.equals("Eight Diamonds") || card.equals("Eight Spades") || card.equals("Eight Clovers")) {
			cardValue = 8;
		}
		else if (card.equals("Nine Hearts") || card.equals("Nine Diamonds") || card.equals("Nine Spades") || card.equals("Nine Clovers")) {
			cardValue = 9;
		}
		else if (card.equals("Ten Hearts") || card.equals("Ten Diamonds") || card.equals("Ten Spades") || card.equals("Ten Clovers")) {
			cardValue = 10;
		}
		else if (card.equals("Jack Hearts") || card.equals("Jack Diamonds") || card.equals("Jack Spades") || card.equals("Jack Clovers")) {
			cardValue = 10;
		}
		else if (card.equals("Queen Hearts") || card.equals("Queen Diamonds") || card.equals("Queen Spades") || card.equals("Queen Clovers")) {
			cardValue = 10;
		}
		else if (card.equals("King Hearts") || card.equals("King Diamonds") || card.equals("King Spades") || card.equals("King Clovers")) {
			cardValue = 10;
		}
		return cardValue;
	}
}
