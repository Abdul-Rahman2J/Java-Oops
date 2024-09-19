package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("The programe start to execute.....");
		System.out.println("Strting the validation part");
		
		Thread.sleep(5000);
		//FileInputStream fil=new FileInputStream("C://CitiDev//program");
		
		System.out.println("The program executed suceessfully");
		System.out.println("Passed....");
	}

}
