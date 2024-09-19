package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add(100);
		mySet.add("Apple");
		mySet.add(null);
		mySet.add(null);
		System.out.println("The hashset value is  "+mySet);// Unordered values will get in hashSet
		
		//Removing the element
		
		mySet.remove(null);   //remove the object via passing the values not in index
		System.out.println("After removing the value  "+mySet);
		
		//Inserting the element directly not possible
		//Accessing the specific elements directly not possible 

		ArrayList AL=new ArrayList(mySet);
		AL.get(0);
		System.out.println(AL);
		
		// get all values
		Iterator al=AL.iterator();
		while(al.hasNext()) {
			System.out.println(al.next());
			
		AL.clear();
		System.out.println("The elements is empty  ?  "+AL.isEmpty());
		}
	}

}
