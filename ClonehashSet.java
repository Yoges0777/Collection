package Hashset;
import java.util.*;
public class ClonehashSet 
{
		public static void main(String[] args) 
		{

			HashSet<Integer> hs=new HashSet<Integer>();
			hs.add(10);
			hs.add(20);
			hs.add(30);
			hs.add(40);
			hs.add(50);
			hs.add(60);
			HashSet<Integer> hs2=new HashSet<Integer>();
			System.out.println(hs);
			
			myCode(hs,hs2);
		}
		public static void myCode(HashSet<Integer> hs,HashSet<Integer> hs2) 
		{
			
		    HashSet hs3=(HashSet)hs.clone();
		    System.out.println(hs3);
		     
			HashSet<Integer>NewHs=new HashSet<>();
			NewHs.addAll(hs);
			System.out.println(NewHs);
		}
}