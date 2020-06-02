
public class StringVariable {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		int i = 0;
		System.out.println("Person " + i + ": "+ firstName +" , "+ lastName);
		
		firstName = "Steve";
		lastName = "Jobs";
		i = i +1;
		System.out.println("Person " + i + ": "+ firstName + " , " + lastName);
		
		firstName = "Jihye";
		lastName = "Park";
		i = i + 1;
		System.out.println("Person " + i + ": "+ firstName + " , " + lastName);
		
		/* Remarks:
		 * lines 8 ,13 ,18 are identical
		 * However, at runtime they differ
		 * depending on the value of the variables
		 * at lines  5-7 ,10-12 and 15-17
		 */
		
	}
}
