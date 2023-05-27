package Hashset;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSetUsingComparotor {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet(new mycomparotor());
		ts.add(11);
		ts.add(12);
		ts.add(13);
		ts.add(14);
		ts.add(15);
		
		
		System.out.println(ts);
	}

}
class mycomparotor implements Comparator
{

	@Override
	public int compare(Object ob1, Object ob2) 
	{
	  Integer i1=(Integer) ob1;
	  Integer i2=(Integer) ob2;
	  
	  if(i1<i2)
		  return +1;
	  else if (i1>i2)
		  return -1;
	  else
		return 0;
	}
	
}
