package Hashset;
import java.util.*;
public class CompareTwoHashset
{
	public static void main(String[] args) 
	{
			HashSet<Integer> hs=new HashSet<Integer>();
			hs.add(100);
			hs.add(20);
			hs.add(70);
			hs.add(80);
			hs.add(50);
			hs.add(60);
			
			HashSet<Integer> hs2=new HashSet<Integer>();
			hs2.add(100);
			hs2.add(20);
			hs2.add(70);
			hs2.add(80);
			hs2.add(50);
			hs2.add(60);
			
			myCode(hs,hs2);
		}
		public static void myCode(HashSet<Integer> hs,HashSet<Integer> hs2) 
		{
			System.out.println(hs.equals(hs2));
			
			
			
		}
	}
