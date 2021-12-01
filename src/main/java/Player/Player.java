package Player;

import Deck.Deck.Card;
import java.util.ArrayList;

public class Player {

    private final String name;
    private final ArrayList<Card> hand = new ArrayList<>();
    private int score;

    public Player(String name){
        this.name = name;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        calculateScore();
        return score;
    }

    private void calculateScore(){
        score = 0;
        for (Card card : hand) {
            switch (card.getValue()) {
                case "2":
                    score += 2;
                    break;
                case "3":
                    score += 3;
                    break;
                case "4":
                    score += 4;
                    break;
                case "5":
                    score += 5;
                    break;
                case "6":
                    score += 6;
                    break;
                case "7":
                    score += 7;
                    break;
                case "8":
                    score += 8;
                    break;
                case "9":
                    score += 9;
                    break;
                case "10":
                case "Q":
                case "K":
                case "J":
                    score += 10;
                    break;
            }

        }
        // checks if A to be 1 or 11
        for (Card card : hand) {
            if (card.getValue().equalsIgnoreCase("A")) {
                score = (score >= 11) ? score + 1 : score + 11;
            }
        }
    }
}
