package TreeSet;
import java.util.*;
public class GetTheElemnetGreaterthanOrEqualToGivenElement
 {
     public static void main(String[] args) 
     {
    	 TreeSet<Integer>set=new TreeSet<Integer>();
         set.add(10);
         set.add(11);
         set.add(12);
         set.add(13);
         set.add(14);
         set.add(15);
         
         int ele=10;
         
         set.ceiling(ele);
         System.out.println(set);
	}     
}
