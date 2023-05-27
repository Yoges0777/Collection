package Hashset;

import java.util.HashSet;

public class CopyHashSet {

	public static void main(String[] args) 
	{
		  HashSet<Integer> set = new HashSet<>();
		  
	        // Add elements to original set
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(10);
	        set.add(50);
	        set.add(20);
	  
	        // Make a new HashSet and copy all elements of
	        // original HashSet using constructor
	        HashSet<Integer> copyOfSet = new HashSet<>(set);
	  
	        // Print original HashSet
	        System.out.println("Original HashSet: " + set);
	  
	        // Print Copy HashSet
	        System.out.println("Copy HashSet: " + copyOfSet);
	    }
	}

