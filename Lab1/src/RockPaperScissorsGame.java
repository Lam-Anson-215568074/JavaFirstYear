import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt for entering player names
		/*
		 * Player 1
		 */
		System.out.println("Enter the name of player 1: ");
		String player1 = input.nextLine();
		/*
		 * Player 2
		 */
		System.out.println("Enter the name of player 2: ");
		String player2 = input.nextLine();
		
		/*
		 * Round 1 
		 */
		// Intro Block
		System.out.println("======================================");
		System.out.println("Round 1:");
		System.out.println("======================================");
		
		// Gameplay
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		String r1p1 = input.nextLine();
		
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		String r1p2 = input.nextLine();
		
		//Score Counter
		int ScoreP1 = 0;
		int ScoreP2 = 0;
		
		//Results of round 1
		if ((r1p1.equals("R") && r1p2.equals("S"))||(r1p1.equals("S") && r1p2.equals("P"))||(r1p1.equals("P") && r1p2.equals("R"))) {
			ScoreP1 += 1;
		}
		else if ((r1p2.equals("R") && r1p1.equals("S"))||(r1p2.equals("S") && r1p1.equals("P"))||(r1p2.equals("P") && r1p1.equals("R"))) {
			ScoreP2 +=1;
		}
		else {
			ScoreP1 = ScoreP1;
			ScoreP2 = ScoreP2;
		}
			
		System.out.println("======================================");
		System.out.println("Round 2:");
		System.out.println("======================================");
			
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		String r2p1 = input.nextLine();
			
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		String r2p2 = input.nextLine();
		if ((r2p1.equals("R") && r2p2.equals("S"))||(r2p1.equals("S") && r2p2.equals("P"))||(r2p1.equals("P") && r2p2.equals("R"))) {
			ScoreP1 += 1;
		}
		else if((r2p2.equals("R") && r2p1.equals("S"))||(r2p2.equals("S") && r2p1.equals("P"))||(r2p2.equals("P") && r2p1.equals("R"))){
			ScoreP2 += 1;	
		}
		else {
			ScoreP1 = ScoreP1;
			ScoreP2 = ScoreP2;
		}
		if (ScoreP1 == 2) {
			System.out.println("Game over: " + player1 + " wins!");
		}
		else if (ScoreP2 == 2) {
			System.out.println("Game over: " + player2 + " wins!");
		}
		else {
			System.out.println("======================================");
			System.out.println("Round 3:");
			System.out.println("======================================");
				
			System.out.println("What does " + player1 + " play? (R, P, or S)");
			String r3p1 = input.nextLine();
				
			System.out.println("What does " + player2 + " play? (R, P, or S)");
			String r3p2 = input.nextLine();
			if ((r3p1.equals("R") && r3p2.equals("S"))||(r3p1.equals("S") && r3p2.equals("P"))||(r3p1.equals("P") && r3p2.equals("R"))) {
				System.out.println("Game over: " + player1 + " wins!");
				
			}
			else if((r3p2.equals("R") && r3p1.equals("S"))||(r3p2.equals("S") && r3p1.equals("P"))||(r3p2.equals("P") && r3p1.equals("R"))) {
				System.out.println("Game over: " + player2 + " wins!");	
			}
			else {
				System.out.println("Game over: a tie between " + player1 +" and " + player2);
			}
		}
		input.close();
	}
}

	
