package TreeSet;
import java.util.*;
public class ConvertHAshsetToTreeSet 
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
			TreeSet<Integer> ts=new TreeSet<Integer>();
			ts=myCode(hs,ts);
			System.out.println(ts);
		}
		//EndOfMainMethod
		public static TreeSet<Integer> myCode(HashSet<Integer> hs,TreeSet<Integer> ts) 
		{
			ts.addAll(hs);
			return ts;
		}
	}

