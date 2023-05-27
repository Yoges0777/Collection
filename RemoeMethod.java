package Hashset;

import java.util.HashSet;

public class RemoeMethod {

	public static void main(String[] args) 
	{
		 HashSet<String> set = new HashSet<String>();
		 
	        // Adding custom input elements into the Set
	        // using add() method
	        set.add("Welcome");
	        set.add("To");
	        set.add("Geeks");
	        set.add("For");
	        set.add("Geeks");
	 
	        // Displaying the HashSet(object elements)
	        System.out.println("HashSet: " + set);
	 
	        // Removing elements
	        // using remove() method
	        set.remove("Geeks");
	        set.remove("For");
	        set.remove("Welcome");
	 
	        // Now displaying the HashSet after removal
	        // of elements from it
	        System.out.println(
	            "HashSet after removing elements: " + set);
	    }

	}

