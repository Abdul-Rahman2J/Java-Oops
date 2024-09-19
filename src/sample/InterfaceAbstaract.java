package sample;

interface skel{
	
	int no1=1001;
	String name="minato"; //-------- both variables defaultly turned into final or static var
	
	void hello(); //------ called abstaract method we can't implement the block of code
	
	default void demo() {
		
		System.out.println("This is called default method...." +no1);
		
	}
	static void demo1() {
		System.out.println("this is called static method ...."+name);
	}
	
	
}

public class InterfaceAbstaract implements skel {
	public void hello() {
		System.out.println("We create the implementation here for abstract method......");
	}
	void hello2() {
		System.out.println("He said hello to you....");
	}

	public static void main(String[] args) {
		
		//Scenerio1
		
		/*InterfaceAbstaract output=new InterfaceAbstaract();
		output.demo();
		output.hello();
		skel.demo1(); //-------------Static method can call directly without creating the object
		output.hello2();*/
		
		//scenerio2
		
		skel skelton=new InterfaceAbstaract(); //---> create the referance variable using interface with support of the class
		skelton.demo();
		skelton.hello();
		skel.demo1();
		//skelton.hello2(); --------------> we cant acces the other class methods 
		
		
		
		 

	}

}
