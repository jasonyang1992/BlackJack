package blackjack;

public class Results {
	
	public void showResult(int pTotal, int dTotal) {
		
		if (pTotal > dTotal && pTotal <= 21) {
			System.out.println("Player Winner");
		}
		else if (dTotal > pTotal && dTotal <= 21) {
			System.out.println("Dealer Winner");
		}
		else if (dTotal == 21) {
			System.out.println("Dealer winner");
		}
		else if (pTotal == 21) {
			System.out.println("Player winnner");
		}
		else if (pTotal == dTotal) {
			System.out.println("Dealer wins house rules");
		}
		else if (pTotal > 21) {
			System.out.println("Player Bust");
		}
		else if (dTotal > 21) {
			System.out.println("Dealer Bust");
		}
	}
}
