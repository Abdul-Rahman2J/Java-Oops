package sample;

class hybrid {
	void noon()
	{
		System.out.println("hello man  ");
	}
	
}

public class Hybridinger extends hybrid implements Apple,Banana {
	public void A1() {
		System.out.println("This value from interface A");
			
	}


	public static void main(String[] args) {
		Hybridinger result=new Hybridinger();
		result.A1();
		result.B1();
		result.noon();
		

	}

}
