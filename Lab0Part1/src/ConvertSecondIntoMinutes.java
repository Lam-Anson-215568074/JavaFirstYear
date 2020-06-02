import java.util.Scanner;

public class ConvertSecondIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("Enter and integer for seconds");
		int sec = input.nextInt();
		input.nextLine();
		int min = sec /60;
		int rem = sec %60;
		System.out.print(name +", ");;
		System.out.print("your input "+sec+" can be divided into ");
		System.out.println(min + " minutes and " + rem + " seconds. ");
		
	}

}
