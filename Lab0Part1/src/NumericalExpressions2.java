
public class NumericalExpressions2 {

	public static void main(String[] args) {
		// 15 + 4
		System.out.println("15 + 4: " + (15+4));//19
		// 15 - 4
		System.out.println("15 + 4: "+ (15-4));//11
		// 15 * 4
		System.out.println("15 * 4: "+ (15*4));//60
		// 15 / 4
		System.out.println("15/4 gives the quotient: " + (15/4));//3
		// 15 % 4
		System.out.println("15%4 gives the remainder: "+ (15%4));//3
		
		
		// 23/ 4
		System.out.println("23/4 gives the quotient: " + (23/4));//5
		// 23 % 4
		System.out.println("23%4 gives the remainder: " + (23%4));//3
		
		// 4*(23/4)+(23%4) = 23
		System.out.println("divisor * quotient + remainder = original number: " + (4*(23/4)+(23%4)));
		System.out.println("output 1+1 ver batim: " + "1+1");
		System.out.println("output the result of calculating 1+1: " + (1+1));
		
		//5.2/2
		System.out.println("5.2 / 2 gives a result with precision: " + (5.2/2));
		//5/2.5
		System.out.println("5/2.5 gives the result with precision: " + (5/2.5));
		
		
	}

}
