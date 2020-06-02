import java.util.Scanner;

public class SimpleUserInput1 {

	public static void main(String[] args) {
		//create and input object of type scanner
		//use input to read integer, double or string
		Scanner input = new Scanner(System.in);
		/*
		 * Step 1: prompt user input.
		 */
		System.out.println("Enter and integer: ");
		/*
		 * Step 2; Read and input
		 */
		int i = input.nextInt();//read int form keyboard and store value into i
		
		//Step 3: perform computation on the values stored
		int square = i * i;
		//step 4: output result onto console
		System.out.println("The square of " + i+" is " +square+".");
		
		input.close();
	
	}

}
