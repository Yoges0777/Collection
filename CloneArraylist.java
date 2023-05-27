package Arraylist;

import java.util.ArrayList;

public class CloneArraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> al1 = new ArrayList<String>();


		al1.add("Mukul");
		al1.add("Rahul");
		al1.add("Suraj");
		al1.add("Mayank");


		ArrayList<String>al2=new ArrayList<>(al1);
		System.out.println(al2);
	}

}
