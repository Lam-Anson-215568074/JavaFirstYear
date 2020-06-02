import java.util.Scanner;
/*
 * If program contains nextInt() or nextDouble() or nextline()
 * put input.nextLine() after every input
 */
public class SimpleUserImput2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number with decimal");
		double n1 = input.nextDouble();
		input.nextLine();
		
		System.out.println("Enter the 2nd Number with decimal");
		double n2 = input.nextDouble();
		input.nextLine();
		
		System.out.println("What is your name? ");
		String name = input.nextLine();
		
		double average = (n1 + n2) /2;
		
		System.out.print(name + ", ");
		System.out.print("the numbers you entered are " + n1 + " and "+ n2+", ");
		System.out.println("their average is "+average);
		
		input.close();

	}

}
