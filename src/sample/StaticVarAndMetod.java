package sample;

public class StaticVarAndMetod {
	static String department="IT";
	String degree;
	private static String department2;
	
	static void course(String dep) {
		String department=dep;

		System.out.println("Congrats you join this course");
	}
	void fee() {
		System.out.println("You successfully payed the fee amount for degree og  :"+degree);
	}

	public static void main(String[] args) {
		System.out.println(department);
		course("CS");
		StaticVarAndMetod sta=new StaticVarAndMetod();
		sta.degree="BCA";
		sta.fee();
		
		
		

	}

}
 
