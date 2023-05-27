package Arraylist;

import java.util.ArrayList;

public class IteratingarraylistUsingForEachLoop {


	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Mango");//Adding object in arraylist    
		list.add("Apple");    
		list.add("Banana");    
		list.add("Grapes");    
		
		for(String fruit:list)   
		{
			System.out.println(fruit);    
		}
	}  
}
