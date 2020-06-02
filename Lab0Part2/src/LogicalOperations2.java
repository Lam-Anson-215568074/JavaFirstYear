
public class LogicalOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p = false;
		boolean q = false;
		boolean conj = p&&q;
		System.out.println("Conjuction of " +p+" "+q+" is: "+conj);
		System.out.println("Disconjunction of "+p+" "+q+" is: "+(p||q));
		p = false;
		q = true;
		conj = p&&q;
		System.out.println("Conjuction of " +p+" "+q+" is: "+conj);
		System.out.println("Disconjunction of "+p+" "+q+" is: "+(p||q));
		p = true;
		q = false;
		conj = p&&q;
		System.out.println("Conjuction of " +p+" "+q+" is: "+conj);
		System.out.println("Disconjunction of "+p+" "+q+" is: "+(p||q));
		p = true;
		q = true;
		conj = p&&q;
		System.out.println("Conjuction of " +p+" "+q+" is: "+conj);
		System.out.println("Disconjunction of "+p+" "+q+" is: "+(p||q));
		
	}

}
