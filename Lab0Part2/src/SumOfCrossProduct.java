import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Inputs for the first sequence denoted
		 * [ a, b, c, d ]
		 */
		//integer "a"  of sequence 1
		System.out.println("Enter the 1st integer for sequence 1:");
		int a = input.nextInt();
		input.nextLine();
		
		//integer "b" of sequence 1
		System.out.println("Enter the 2nd integer for sequence 1:");
		int b = input.nextInt();
		input.nextLine();
		
		//integer "c" of sequence 1
		System.out.println("Enter the 3rd integer for sequence 1:");
		int c = input.nextInt();
		input.nextLine();
		
		//integer "d" of sequence 1
		System.out.println("Enter the 4th integer for sequence 1:");
		int d = input.nextInt();
		input.hasNextLine();
		
		/*
		 * Inputs for second sequence denoted
		 * [ A, B, C, D ]
		 */
		
		//integer "A" for sequence 2
		System.out.println("Enter the 1st integer for sequence 2:");
		int A = input.nextInt();
		input.hasNextLine();
		
		//integer "B" for sequence 2
		System.out.println("Enter the 2nd integer for sequence 2");
		int B = input.nextInt();
		input.nextLine(); 
		
		//integer "C" for sequence 2
		System.out.println("Enter the 3rd integer for sequence 2:");
		int C = input.nextInt();
		input.nextLine();
		
		//integer "D" for sequence 2
		System.out.println("Enter the 4th integer for sequence 2:");
		int D = input.nextInt();
		input.nextLine();
		
		int CP = (a * A) + (b * B) + (c * C) + (d * D);
		
		System.out.print("sum([" + a + ", ");
		System.out.print( b + ", ");
		System.out.print( c + ", ");
		System.out.print( d + "] * [");
		System.out.print( A + ", ");
		System.out.print( B + ", ");
		System.out.print( C + ", ");
		System.out.println( D + "]) = " + CP);
	
		input.close();
	}
}

