import java.util.Scanner;

public class IfStatementsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer balance");
	int balance = input.nextInt();
	
	System.out.println("Enter an amount to withdraw:");
	int amount = input.nextInt();
	
	if (balance<0||amount<0||amount >= balance) {
		System.out.println("error, launch again");
	}
	else {
		int balance2 = balance - amount;
		System.out.print("Initial balance "+balance+" after withdrawing "+ amount);
		System.out.println(" has the resulting balance "+balance2);
		
		
	}
	input.close();
	
	}

}
