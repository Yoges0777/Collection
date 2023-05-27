package TreeSet;
import java.util.*;
public class AddAllELEmentOfTreeSetToAnothertreSet
{ 
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Pink");
		set.add("White");
		set.add("Black");
		HashSet<String> newSet = new HashSet<String>();
		myCode(set,newSet);
	}
	//EndOfMainMethod
	public static void myCode(HashSet<String> set,HashSet<String> newSet) 
	{
		set.addAll(newSet);
		System.out.println(set);
	}
}