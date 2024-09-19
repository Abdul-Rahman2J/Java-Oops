package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add('A');
		myList.add(true);
		myList.add(null);
		myList.add(100);
		myList.add(null); // Can hold the dublicate also 
		System.out.println("To printing the Array values is  :  "+myList);
		System.out.println(myList.size());
		
		//Remove the element
		myList.remove(6);
		System.out.println("After removing the duplicate Array values is  :  "+myList);
		
		// Insert the element
		
		myList.add(2,"Hello");
		System.out.println("After Inserting the Array values is  :  "+myList);
		
		//Modify or update the element
		
		myList.set(3,"Good Luck!");
		System.out.println("After updating the Array values is  :  "+myList);
		
		//Access Specific Element
		
		myList.get(3);
		System.out.println(myList.get(3));
		
		// Iterator to get all elements
		
		Iterator IT=myList.iterator();
		
		
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
		//Remove  multiple index values in single shot
		
		ArrayList myList2=new ArrayList();
		myList2.add(100);
		myList2.add(10.5);
		myList.removeAll(myList2);
		System.out.println("After removing the some elements in the index  :  "+myList);
		
		//clear all elements 
		
		myList.clear();
		
		// To check the array list is Empty not
		
		System.out.println("The array list is emty?  "+ myList.isEmpty());
		
		
		

	}

}
