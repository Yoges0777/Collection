package Arraylist;
import java.util.*;
public class SortArrayList 
{

			public static void main(String[] args) 
			{
				  List<String> List1 = new ArrayList<String>();
				  List1.add("x");
				  List1.add("y");
				  List1.add("z");
				  List1.add("a");
				myCode(List1);
			}
			
		public static void myCode(List<String> list1) 
		{
			Collections.sort(list1);
			System.out.println(list1);
		}
}