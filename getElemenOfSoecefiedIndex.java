package Arraylist;

import java.util.*;
public class getElemenOfSoecefiedIndex 
{
	
			public static void main(String[] args) 
			{
				  List<String> List1 = new ArrayList<String>();
				  List1.add("x");
				  List1.add("y");
				  List1.add("u");
				  List1.add("a");
				  int index=2;
				myCode(List1,index);
			}
			//EndOfMainMethod

		public static void myCode(List<String> list1,int index) 
		{
			System.out.println(list1.get(index));
			 
		}
	}

