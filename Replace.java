package Linkelist;
import java.util.*;
public class Replace extends Exception {}
    
    interface sample{
    void print(String t)throws Replace;
    }

     class test
     {
		public static void main(String[] args) throws Replace
		{
			sample s=t ->
			{
				if(t.length()==0)
					throw new Replace();
				else
					System.out.println(t);
			};
			s.print("i reached succesfully");
			s.print(" ");
			s.print("i too reached succesfully");
		}
		
}