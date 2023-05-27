package Arraylist;
import java.util.*;
public class RemoveSpecefiedElementFromArrayList {

	public static void main(String[] args)
	{
	   ArrayList<Integer>al=new ArrayList<Integer>();
	   al.add(1);
	   al.add(2);
	   al.add(3);
	   al.add(4);
	   al.add(5);
	   
	   int ele=2;
	   
	   al.remove(ele);
	   System.out.println(al);
	}

}
