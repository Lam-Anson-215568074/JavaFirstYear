import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*
		 * Objectives:
		 * 1. Write a code in combination of learned material to create a data base
		 * 2. database takes names, store values based off alphabetical order, then input order 
		 * 3. should be able to recall list and find specific input off list.
		 */

		// Initial name organization
		String Cont = "Y";
		while (Cont.equals("Y")){
			System.out.println("What would you like to do?");
			System.out.println("To enter an new entry: Enter (E) ");
			System.out.println("To end application: Enter (N) ");
			String Action = input.nextLine();


			if(Action.equals("E")){
				System.out.println("How many entries would you like to make?");
				int EntryNum = input.nextInt();
				input.nextLine();
				String[] listNames = new String[EntryNum];
				
				for (int i = 1 ;i<= EntryNum; i++) {
					System.out.println("Please enter the name: ");
					String Name = input.nextLine();
					
					listNames[i-1] = Name;
				}
				System.out.println("Would you like to review entries (Y/N)");
				String Review = input.nextLine();
				
				if(Review.equals("Y")) {
					for(int j = 0 ; j < listNames.length; j++) {
						System.out.println(listNames[j]);
					}
				}
				else {
					System.out.println("invalid entry please retry");
					Review = input.nextLine();
				}

				System.out.println("Would you like to continue? (Y/N)");
				Cont = input.nextLine();
			}
			else if(Action.equals("N")) {
				Cont = "N";
			}
			else {
				System.out.println("invalid entry please retry");
				Action = input.nextLine();
			}	
		}

		System.out.println("Thank you for using Tester1");	
		input.close();
	}

}
