package ArrayListImplemnt;

import java.util.ArrayList;

public class ComapreArrListYESNO {

	public static void main(String[] args)
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("amol");
		a1.add("yogi");
		a1.add("King");
		a1.add("Topper");
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Ram");
		a2.add("yogi");
		a2.add("King");
		a2.add("Variation");
		
		ArrayList<String> a3= new ArrayList<String>();
		
		for(String s1 : a1)
		{
			a3.add(a2.contains(s1) ? "YES" : "NO");
		}
		System.out.println(a3);
	

	}

}
