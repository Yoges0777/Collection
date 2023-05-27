package TreeSet;

import java.util.TreeSet;

public class GetFirstAndLastElemntIntTreeSet {

	public static void main(String[] args) 
	{
		 TreeSet<Integer>set=new TreeSet<Integer>();
	       set.add(10);
	       set.add(11);
	       set.add(11);
	       set.add(12);
	       set.add(13);
	       set.add(14);
	       
	       
	       System.out.println(set.first());

	}

}
