import java.util.Scanner;

public class LogicalOperationApp2b {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer between 1 and 10");
		int i = input.nextInt();
		// wrong version
		boolean isBetween1And10 = 1<= i || i <= 10;
		System.out.println("The number you entered "+i+" is between 1 and 10: "+ isBetween1And10);
		input.close();
		
		
	}

}
