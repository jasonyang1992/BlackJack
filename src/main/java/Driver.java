import Deck.Deck;
import Player.Player;

import java.util.Scanner;
import java.util.logging.Logger;

public class Driver {

    private static final Logger log = Logger.getLogger(Driver.class.getName());

    public static void main(final String[] args){
        log.info("Game has started");

        System.out.println("Game Start");
        Deck deck = new Deck(true);

        boolean playerDone = false;
        boolean dealerDone = false;


        Scanner playerInput = new Scanner(System.in);

        System.out.println("Enter your name");
        Player player = new Player(playerInput.next());
        Player dealer = new Player("Dealer");


        log.info("Looping cards");

        for (int i = 0; i < 2; i ++){
            player.addCard(deck.getCard());
            dealer.addCard(deck.getCard());
        }

        log.info(player.getName() + " has started to draw");
        while (!playerDone){
            for (int i = 0; i < player.getHand().size(); i++){
                System.out.println(player.getHand().get(i).getSuit() + " " + player.getHand().get(i).getValue());
            }
            System.out.println("Your score is " + player.getScore());

            if (player.getScore() > 21){
                log.info(player.getName() + " has busted");
                System.out.println("Busted");
                System.exit(0);
            }

            System.out.println("Enter H to hit or S to stop");

            if ("h".equalsIgnoreCase(playerInput.next())){
                player.addCard(deck.getCard());
            }
            else{
                log.info(player.getName() + " has ended");
                playerDone = true;
            }



        }

        log.info(dealer.getName() + " has started to draw");
        while (!dealerDone){
            for (int i = 0; i < dealer.getHand().size(); i++){
                System.out.println(dealer.getHand().get(i).getSuit() + " " + dealer.getHand().get(i).getValue());
            }
            System.out.println("Dealer score is " + dealer.getScore());

            if(dealer.getScore() >= 16){
                dealerDone = true;
            }
            else{
                dealer.addCard(deck.getCard());
            }
        }

        if (checkWinner(player.getScore(), dealer.getScore())){
            log.info(player.getName() +" has won");
            System.out.println(player.getName() + " win");
        }
        else{
            log.info((dealer.getName() + " has won"));
            System.out.println("Dealer wins");
        }


    }

    public static boolean checkWinner(final int playerScore, final int dealerScore) {
        if (playerScore == dealerScore){
            log.info("playerScore is " + playerScore + " and dealerscore is " +dealerScore);
            return false;
        }
        else if ( dealerScore > 21){
            log.info("playerScore is " + playerScore + " and dealerscore is " +dealerScore);
            return true;
        }
        else return playerScore > dealerScore;
    }

}
