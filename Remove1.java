package Hashset;

import java.util.HashSet;

public class Remove1 {

	public static void main(String[] args) 
	{
		 HashSet<Integer> set = new HashSet<Integer>();
		 
	        // Adding custom input elements into the Set
	        // using add() method
	        set.add(5);
	        set.add(3);
	        set.add(1);
	        set.add(4);
	        set.add(3);
	 
	        // Displaying the HashSet(object elements)
	        System.out.println("HashSet: " + set);
	 
	        // Removing elements
	        // using remove() method
	        set.remove(3);
	        set.remove(1);
	 
	        // Now displaying the HashSet after removal
	        // of elements from it
	        System.out.println(
	            "HashSet after removing elements: " + set);
	    }
	}
