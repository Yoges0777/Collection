package Arraylist;
import java.util.*;
public class IterateThroughallelentInaaraylist 
{
			public static void main(String[] args) 
			{
				  List<String> List1 = new ArrayList<String>();
				  List1.add("x");
				  List1.add("y");
				  List1.add("u");
				  List1.add("a");
				myCode(List1);
			}
			
		public static void myCode(List<String> list1) 
		{
			Iterator i = list1.iterator();
			System.out.println("The ArrayList elements are:");
			while (i.hasNext())
			{
				System.out.println(i.next());
			}
			 
			
			
		}
	}

	
