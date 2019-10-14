package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		String key = null;
		int pTotal, dTotal;
		
		Scanner keyBoard = new Scanner(System.in);
		FindValue fv = new FindValue();
		Results r = new Results();
		Deck d = new Deck();

		ArrayList<String>pHand = new ArrayList<String>();

		
	// Player Draws
		for (int i = 0; i < 2; i ++) {
			pHand.add(String.valueOf(d.draw()));
		}
		do {
			pTotal = 0;
			for (int i = 0; i < pHand.size(); i++) {
				System.out.println(pHand.get(i));
				pTotal += fv.getValue(pHand.get(i), pTotal);
				System.out.println("Your Total is: " + pTotal);
			}
			
			if (pTotal < 21) {
				key=keyBoard.next();
			}
			if(key.equals("hit")) {
				pHand.add(String.valueOf(d.draw()));
				Collections.sort(pHand);
				Collections.reverse(pHand);
			}
			else {
				break;
			}
		}while (pTotal < 22);
		
	// Dealer Draws
		
		ArrayList<String>dHand = new ArrayList<String>();
		
		for (int i = 0; i < 2; i++) {
			dHand.add(String.valueOf(d.draw()));
		}
		
		do {
			dTotal = 0;
			for (int i = 0; i <dHand.size(); i ++) {
				dTotal += fv.getValue(dHand.get(i), dTotal);
			}
			dHand.add(String.valueOf(d.draw()));
			Collections.sort(pHand);
			Collections.reverse(pHand);
			
		}while(dTotal < 16);
		System.out.println("Dealer total is " +dTotal);
		r.showResult(pTotal, dTotal);
		keyBoard.close();
	}
}
