import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Name prompt
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		//weight and height prompt
		System.out.println(name + ", enter your height in inches:");
		int hi = input.nextInt();
		input.nextLine();
		System.out.println(name + ", enter your weight in pounds:");
		int wi = input.nextInt();
		input.nextLine();
		
		//conversions to metric
		final double hc = 0.0254;
		final double wc = 0.45359237;
		double h = hi * hc;
		double w = wi * wc;
		
		//Calculations for BMI
		double BMI =  w / (h*h);
		
		if (BMI < 18.5) {
			System.out.println(name + ", your BMI is " + BMI);
			System.out.println("You are underweight!");
		}
		else if( BMI >= 18.5 && BMI < 25.0 ) {
			System.out.println(name + ", your BMI is " + BMI);
			System.out.println("You are normal!");
		}
		else if (BMI >= 25.0 && BMI < 30.0) {
			System.out.println(name + ", your BMI is " + BMI);
			System.out.println("You are overweight!");
		}
		else if (BMI >= 30.0) {
			System.out.println(name + ", your BMI is " + BMI);
			System.out.println("You are obese!");
		}
	
		input.close();
	}
}
