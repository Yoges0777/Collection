package LinkedListImplement;

import java.util.LinkedList;

public class LinkedkListt {

	public static void main(String[] args) 
	{
		AllMethodImplementatio<Integer>ll=new AllMethodImplementatio<>();
		ll.myadd(10);
		ll.myadd(20);
		ll.myadd(20);
		ll.myadd(30);
		ll.myadd(40);
		
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		ll.addAt(1, 100);
		ll.contains(10);
		ll.equals(ll);
		ll.isEmty();
		ll.myadd(10);
		
		ll.myGet(11);
		ll.mySize();
		ll.set(1,11);
		ll.toString();
		
		
	}
}
