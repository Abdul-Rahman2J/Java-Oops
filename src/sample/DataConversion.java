package sample;

public class DataConversion {

	public static void main(String[] args) {
	
		
		int a=1500;
		double c=55.8d;
		char d='h';
		float e=12.99f;
		//Converting into String
		
		String con=String.valueOf(a);
		String con1=String.valueOf(c);
		String con2=String.valueOf(d);
		String con3=String.valueOf(e);
		System.out.println(con+con1+con2+con3);
		
		//Converting string into primitive data types
		
		String A="60";
		String B="556.0";
		String C="This is boolian";
		String D="15.88";
		
		System.out.println(Integer.parseInt(A));
		System.out.println(Double.parseDouble(B));
		System.out.println(Boolean.parseBoolean(C));
		System.out.println(Float.parseFloat(D));
		
		
		
		
	}

}
