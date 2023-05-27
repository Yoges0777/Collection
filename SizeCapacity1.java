package Arraylist;

import java.util.ArrayList;

public class SizeCapacity1 
{
	public static void main(String[] args) throws Exception  
	{    
		ArrayList<Integer> al = new ArrayList<Integer>(10);  

		System.out.println("The size of the array is: " + al.size());  
	}  

}
/*  
We see that the size is still 0, and the reason behind this is the number 10 represents 
the capacity no the size.  
In fact, the size represents the total number of elements present in the array.
As we have not added any element, therefore, the size of the array list is zero in both programs.
Capacity represents the total number of elements the array list can contain. 
Therefore, the capacity of an array 
list is always greater than or equal to the size of the array list. When we add an element to the array list, 
it checks whether the size of the array list has become equal to the capacity or not. 
If yes, then the capacity 
of the array list increases. So, in the above example, the capacity will be 10 till 10 elements are added to the list. 
When we add the 11th element, the capacity increases.
Note that in both examples, the capacity of the array list is 10. 
In the first case, the capacity is 10 because the default capacity of the array list is 10. 
In the second case, we have explicitly mentioned that the capacity 
of the array list is 10.
  */
