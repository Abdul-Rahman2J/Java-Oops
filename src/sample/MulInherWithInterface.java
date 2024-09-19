package sample;

interface Apple{
	void A1();
	
}
interface Banana{
	default void B1() {
		System.out.println("This is Interface B ");
	}
}

public class MulInherWithInterface implements Apple,Banana {
	public void A1() {
		System.out.println("This value from interface A");
			
	}

	public static void main(String[] args) {
		MulInherWithInterface inter=new MulInherWithInterface();
		inter.A1();
		inter.B1();

	}

}
