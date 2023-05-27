package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class Itearte {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		//by for each loop
		for(int num:al)
		{
			System.out.println(num);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(i+" "+al.get(i));
		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
