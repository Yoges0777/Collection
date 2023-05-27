package Arraylist;
import java.util.*;
public class ExtractPortionOfArraylist
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(9);
		list.add(7);
		int start=1;
		int end=3;
		myCode(list,start,end);
	}
	public static void myCode(ArrayList<Integer> al,int start,int end) 
	{
		List<Integer>subli=al.subList(start, end);
		System.out.println(subli);
		
		
		
		
	}
}