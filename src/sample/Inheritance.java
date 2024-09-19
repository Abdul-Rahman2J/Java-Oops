package sample;

class a{
	String name="abdul";
	
	void display() {
		System.out.println("The name is  "+name);
	}
}
class b extends a{
	void todal() {
		System.out.println("the final output is ");
	}
}
class c extends b{
	void output() {
		System.out.println("this is call multi level inheritance");
	}
}
class d extends a{
public	void hierchy()
	{
		System.out.println( );
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//b Obj=new b();
		//Obj.display();
		c res=new c();
		res.display();
		res.todal();
		res.output();
		
		

	}

}
