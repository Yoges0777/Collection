package TreeSet;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSetToAnArray {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		Object []array=hs.toArray();
		System.out.println(Arrays.toString(array));
	}

}
