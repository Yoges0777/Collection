package Arraylist;
import java.util.*;
public class AddELEmentAtSpeceficIndex 
{
			public static void main(String[] args) 
			{
//				String []a= {"yogesh","ram"};
//				
//				List l=Arrays.asList(a);
//				
//				System.out.println(l);
				
		
				
//				List l = Arrays.asList(ArrayUtils.toObject(a));
//				System.out.println(l);
				
				HashMap<Integer, String>hm=new HashMap<>();
				hm.put(1, "ram");
				hm.put(2, "ram");
				hm.put(3, "ram");
				hm.put(4, "ram");
				System.out.println(hm);
				System.out.println(hm.keySet());
				System.out.println(hm.values());
				System.out.println(hm.entrySet());
				
				
				String s1=new String("yogesh");
				String s2=new String("yogesh");
				String s3 = s2.intern();
				System.out.println(s1==s3);
				System.out.println(s1.equals(s3));
				
			
				
				
			}
	}


	