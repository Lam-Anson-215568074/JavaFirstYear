
public class SwapTwoStringsRight {

	public static void main(String[] args) {
		String person1 = "Alan";
		String person2 = "Tom";
		
		System.out.print("Before the swap: ");
		System.out.print("person 1 is " + person1 + " and ");
		System.out.println("person2 is " +person2 +".");
		
		//swap
		//Correct Implementation
		String temp = person1;
		person1 = person2;
		person2 = temp;
		
		System.out.print("After the swap: ");
		System.out.print("person1 is " + person1+" and ");
		System.out.println("person2 is "+person2+".");
		
		int x = 5;
		int y = 7;
		System.out.println("x is "+x+" and y is "+y+" , now lets swap.");
		int z = x;
		x = y;
		y = z;
		System.out.println("Now x is: "+x+" and y is: " +y+"!");
		

	}

}
