import java.util.Random;
import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args){
		int num1, num2, num3, total, newTotal; // player variables
		int dnum1, dnum2, dnum3, dtotal, dnewtotal; // dealer variables

		String choice = "";
		Random ran = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("----------Black Jack----------");
		System.out.println("------------------------------");
		
// player hand				
		num1 = ran.nextInt(9) + 2;
		System.out.println("Your first number is: " + num1);
		num2 = ran.nextInt(9) + 2;
		System.out.println("Your second number is: " + num2);
		total = num1 + num2;
		System.out.println("    Your total is: " +total);
		System.out.println("------------------------------");
		
// Dealer hand
		dnum1 = ran.nextInt(9) + 2;
		dnum2 = ran.nextInt(9) + 2;
		dtotal = dnum1+dnum2;
		System.out.println("Dealer total is: " +dtotal);
		System.out.println("------------------------------");

// loop for hitting and stopping
		do{
			System.out.println("hit or stop");
			choice = in.nextLine();
			if (choice.equals("hit")){		
				System.out.println("------------------------------");
				num3 = ran.nextInt(9) + 2;
				System.out.println("Your next number is: " + num3);
				newTotal = total + num3;
				total = newTotal;
				System.out.println("Your total is: " + total);				
			}
			else if (choice.equals("stop")){
				break;
			}
		} while (total < 21);
		
// loop for Dealer. cannot be greater than 17
		do{
			if (dtotal < 17 && total < 21){
				System.out.println("------------------------------");
				System.out.println("Current Dealer count is: " + dtotal);
				System.out.println("Dealer hits");
				dnum3 = ran.nextInt(9) + 2;
				System.out.println("Dealer next number is: " +dnum3);
				dnewtotal = dtotal + dnum3;
				dtotal = dnewtotal;
				System.out.println("Dealer new total is: " +dtotal);
			}
			else if (total > 21){
				System.out.println("Dealer stops");
				break;
			}
		} while (dtotal < 17 && total < 21);

// Winners		
		if (total == 21){
			// player gets 21 exactly
			System.out.println("------------------------------");
			System.out.println("Black Jack, you win");
		}
		else if (total > dtotal && total <= 21){
			// player higher than dealer
			System.out.println("------------------------------");
			System.out.println("You win!!!");
		}
		else if (dtotal > total && dtotal <= 21){
			// dealer is higher than player
			System.out.println("------------------------------");
			System.out.println("Dealer wins!!!");
		}
		else if (dtotal > 21){
			// dealer busts
			System.out.println("------------------------------");
			System.out.println("You win!!!");
		}
		else if (dtotal == total){
			// house rules
			System.out.println("------------------------------");
			System.out.println("House rules, dealer wins");
		}
		else if (total > 21){
			// player busts
			System.out.println("------------------------------");
			System.out.println("Dealer wins!!!");
		}
		in.close(); // closing scanner
	}
}