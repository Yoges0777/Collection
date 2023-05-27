package Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClearMethod 
{
	public static void main(String[] args) 
	{
		 // Creating an empty HashSet
        TreeSet<String> set = new TreeSet<>();
  
        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
  
        // Displaying the HashSet
        System.out.println("HashSet: " + set);
  
        // Clearing the HashSet using clear() method
        set.clear();
  
        // Displaying the final Set after clearing;
        System.out.println("The final set: " + set);
    }
	}
