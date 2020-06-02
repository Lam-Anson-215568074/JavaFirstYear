import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//stage 1
		
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		if(0<balance && balance <=1000) {
			
		}
		else {
			System.out.println("Error: intitial balance " + balance + " is nt in (0, 1000).");
			
		}
		
		//stage 2
		
		System.out.println("Enter a trasnsaction type (\"d\" or \"w\"): ");
		String type = input.nextLine();
		if (type.equals("d")){
			
		}
		else if (type.equals("w")) {
			
		}
		else {
			System.out.println("Error: transaction type " + type + " is neither d nor w. ");
		}
		
		//stage 3
		System.out.println("Enter the amount for " + type + ":");
		double amount = input.nextDouble();
		input.nextLine();
		if (type.equals("d")) {
			if (amount <=0) {
				System.out.println("Error: deposit amount is not positive");
			}
			else if (balance + amount > 1000) {
				System.out.println("Error: deposit amount is too large");
			}
			else {
				balance += amount;
				
			}
		}
		else if(type.equals("w")) {
			if (amount <=0) {
				System.out.println("Error: withdrawal amount is not positive");
			}
			else if (amount >= balance) {
				System.out.println("Error: withdrawal amount is too large");
			}
			else {
				balance -= amount;
			}
		}

		System.out.println("Resulting balance after performing the transaction of " + type + " with $" + amount + ": " + balance);
		input.close();
		

	}

}
