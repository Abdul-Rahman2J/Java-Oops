package sample;

class dummy{
	int rollno=50011;
}

class SuperrKey extends dummy {
		int rollno=10000;
		String name="Minato";
		
		
void student() 
{
			int rollno=10080;
			String name="Toji";
			System.out.println("The roll no is  "+super.rollno+" and the name is  "+name);
		}
}
	
	
class naruto extends SuperrKey{
void student()
{
			//int no=10880;
			int rollno=7990;
			String name="Sukuna";
			System.out.println("The roll no is  "+super.rollno+" and the name is  "+name);
		}
		
	}
public class SuperKey{

	public static void main(String[] args) {
		naruto blue=new naruto();
		blue.student();
		
	
	
		

	}

}
