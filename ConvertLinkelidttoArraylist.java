package Linkelist;
import java.util.*;
public class ConvertLinkelidttoArraylist
{
	 
	
		public static void main(String[] args) 
		{
			LinkedList<Integer> list1=new LinkedList<Integer>();
			list1.add(42);
			list1.add(16);
			list1.add(33);
			list1.add(94);
			list1.add(87);
			ArrayList<Integer> al=new ArrayList<Integer>();
			myCode(list1,al);
		}
		//EndOfMainMethod
		public static void myCode(LinkedList<Integer> list1,ArrayList<Integer> al) 
		{
			ArrayList<Integer>all=new ArrayList<Integer>(list1);
			System.out.println(all);
		}
	}
