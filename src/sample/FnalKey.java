package sample;



public class FnalKey {
	final String name="Abdul";
	
	final void hello() {
		System.out.println("this is the final method ...."+name);
	}
	final class blu{
		void green() {
			System.out.println("the method name is Green...");
			
		}
		void hello() {
			System.out.println("dfghjk");
		}
		
	}
	//class red extends blu{  ------// we can't extend the final class
	//	void summa() {
			
	//	}
		
	//}
	
	

	public static void main(String[] args) {
		FnalKey fn=new FnalKey();
		//fn.name="red";-----------------------------------> the final keyword not allow to replace value of the finalized variable 
		fn.hello();

	}
}

