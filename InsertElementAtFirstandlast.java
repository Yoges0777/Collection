package Linkelist;
import java.util.*;
public class InsertElementAtFirstandlast 
{
	public static void main(String[] args) 
			{
				LinkedList<Integer> list1=new LinkedList<Integer>();
				list1.add(4);
				list1.add(6);
				list1.add(3);
				list1.add(9);
				list1.add(7);
				
				int addFirstEle=100;
				int addLastEle=200;
				System.out.println(list1);
				myCode(list1,addFirstEle,addLastEle);
			}
			//EndOfMainMethod

		public static void myCode(LinkedList<Integer> list1,int addFirstEle,int addLastEle)  
		{
			
			list1.addFirst(addFirstEle);
			list1.addLast(addLastEle);
			System.out.println(list1);
			
		}
	}