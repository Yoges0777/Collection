package TreeSet;
import java.util.*;
public class GetFirstAndlastElemntOfTrreeSet 
{
			public static void main(String[] args) 
			{
				TreeSet<Integer> set = new TreeSet<Integer>();
				  set.add(82);
		          set.add(6);
		          set.add(12);
		          set.add(94);
		          set.add(6);
		          
				myCode(set);
			}
		public static void myCode(TreeSet<Integer> set) 
		{
			
			System.out.println(set.pollFirst());
			
			System.out.println(set.pollLast());
		}
	}


