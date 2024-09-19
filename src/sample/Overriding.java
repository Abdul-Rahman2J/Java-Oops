package sample;

class vehicle{
	void bike(String Bike)
	{
		System.out.println("The bike name is  "+Bike);
	}
	void biker(String Bike) {
		System.out.println("The biker name is  "+Bike);
		
	}
	
}
class rider extends vehicle
{
	void bike(String Bike)		//Method Overriding
	{
		System.out.println("The bike name is  "+Bike);
	}
	void biker(int price)		//Method Overloading
	{
		System.out.println("Price of the bike in rupee  "+price);
	
	
}
}

public class Overriding {

	public static void main(String[] args) {
		rider drve=new rider();
		drve.bike("JAWA");
		drve.biker(250000);
		drve.biker("Minato");
		

	}

}
