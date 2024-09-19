package sample;
import java.util.Scanner;

public class ConditionState {
	void hello() {
	String a="Apple";
	//int b;
	Scanner run=new Scanner(System.in);
	System.out.println("Enter you lucky number  :  ");
	a=run.nextLine();
	//System.out.println("Enter you card number  :  ");
	//b=run.nextInt();
	String c=a;
	//c=b;
	
	if(a.equals(c)) {
		System.out.println("The input value is same");
	}
	else {
		System.err.println("The value is not same");
	}
	
	}
	

	public static void main(String[] args) {
		ConditionState output=new ConditionState();
		output.hello();
		

	}

}
