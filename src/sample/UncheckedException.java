package sample;

public class UncheckedException {

	public static void main(String[] args) {
		String A="Welcome";
		//System.out.println(Integer.parseInt(A));
		try {
			System.out.println(Integer.parseInt(A));
		}
		catch(Exception e)
		{
			System.out.println("The handled exception");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("To close the exception");
		}

	}

}
