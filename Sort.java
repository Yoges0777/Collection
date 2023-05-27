package Arraylist;
import java.util.*; 
public class Sort 
{

	public class SortArrayListExample1  
	{   
		public static void main(String args[])   
		{   
			// creating object of ArrayList class  
			ArrayList<String> list = new ArrayList<String>();   
			// adding elements to the ArrayList   
			list.add("Volkswagen");   
			list.add("Toyota");   
			list.add("Porsche");   
			list.add("Ferrari");   
			list.add("Mercedes-Benz");   
			list.add("Audi");   
			list.add("Rolls-Royce");  
			list.add("BMW");  
			
			Collections.sort(list);   
			System.out.println("After Sorting: "+ list);   
		}   
	}  
}