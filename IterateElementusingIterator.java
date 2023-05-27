package TreeSet;
import java.util.*;
public class IterateElementusingIterator
{
	public static void main(String[] args) 
	{
       TreeSet<Integer>set=new TreeSet<Integer>();
       set.add(10);
       set.add(11);
       set.add(11);
       set.add(12);
       set.add(13);
       set.add(14);
       
       System.out.println();
       
       Iterator it=set.descendingIterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
	}
}
