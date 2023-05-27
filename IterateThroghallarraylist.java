package Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IterateThroghallarraylist
{


	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("Adam");
		aList.add("John");
		aList.add("Nancy");
		aList.add("Peter");
		aList.add("Mary");
		
		Iterator i=aList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
