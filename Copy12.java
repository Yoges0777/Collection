package Arraylist;

import java.util.ArrayList;

public class Copy12 {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		
		ArrayList<Integer>al2=new ArrayList<>();
		al2.addAll(al);
		System.out.println(al2);
		
		
		ArrayList<Integer>al3=new ArrayList<>(al);
		System.out.println(al3);
	}

}
