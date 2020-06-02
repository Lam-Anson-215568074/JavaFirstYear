import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter and integer for radius: ");
		int r = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your name");
		String name = input.nextLine();
		double pi = 3.14;
		double p = 2*pi*r;
		double a = pi *(r*r);
		System.out.print(name + ", ");
		System.out.print("your input circle with radius "+r);
		System.out.print(" has perimeter "+p+" and ");
		System.out.println("area " +a + ".");
		input.close();
	
		
	}

}
