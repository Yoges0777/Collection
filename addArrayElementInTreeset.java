package TreeSet;
import java.util.*;
public class addArrayElementInTreeset {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5,6};
		
		TreeSet<Integer>ts=new TreeSet<>();
		for(int num:a)
		{
			ts.add(num);
		}
		System.out.println(ts);
		

	}

}
