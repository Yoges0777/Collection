package Linkelist;
import java.util.*;

public class IterateThroughalleelmentInLinkedListAtSpecefiedPosition
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		int pos=1;
		myCode(list1,pos);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int pos) 
	{
		/*ListIterator itr =list1.listIterator(pos);
		while (itr.hasNext())
		{
			//System.out.print(itr.next() + " ");
		}*/
		for(int i=pos;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	}
}
