import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//first string under variable a
		System.out.println("Enter the 1st string:");
		String a = input.nextLine();
		
		//second string under variable b
		System.out.println("Enter the 2nd string:");
		String b = input.nextLine();
		
		//third string under variable c
		System.out.println(" Enter the 3rd string:");
		String c = input.nextLine();
		
		//fourth string under variable d
		System.out.println("Enter the 4th string:");
		String d = input.nextLine();
		/*
		 * Inputs of four integers will be assigned
		 * A , B , C, D
		 */
		//integer A
		System.out.println("Enter the 1st interger:");
		int A = input.nextInt();
		input.nextLine();
		
		//integer B
		System.out.println("Enter the 2nd integer:");
		int B = input.nextInt();
		input.nextLine();
		
		//integer C
		System.out.println("Enter the 3rd integer:");
		int C = input.nextInt();
		input.nextLine();
		
		//integer D
		System.out.println("Enter the 4th integer:");
		int D = input.nextInt();
		input.nextLine();
		
		System.out.println("Here are all 16 possible combinations:");
		
		//set for a
		System.out.println( "(" + a + ", " + A + ")" );
		System.out.println( "(" + a + ", " + B + ")" );
		System.out.println( "(" + a + ", " + C + ")" );
		System.out.println( "(" + a + ", " + D + ")" );
		
		//set for b
		System.out.println( "(" + b + ", " + A + ")" );
		System.out.println( "(" + b + ", " + B + ")" );
		System.out.println( "(" + b + ", " + C + ")" );
		System.out.println( "(" + b + ", " + D + ")" );
		
		//set for c
		System.out.println( "(" + c + ", " + A + ")" );
		System.out.println( "(" + c + ", " + B + ")" );
		System.out.println( "(" + c + ", " + C + ")" );
		System.out.println( "(" + c + ", " + D + ")" );
		
		//set for d
		System.out.println( "(" + d + ", " + A + ")" );
		System.out.println( "(" + d + ", " + B + ")" );
		System.out.println( "(" + d + ", " + C + ")" );
		System.out.println( "(" + d + ", " + D + ")" );
		
		input.close();
		
		
		
		
		
	}

}
