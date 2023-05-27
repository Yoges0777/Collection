package ArrayListImplemnt;

public class clear1 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		MyLinkedList<Integer> ll=new MyLinkedList<>();
		ll.myAdd(10);
		ll.myAdd(20);
		ll.myAdd(30);
		ll.myAdd(40);
		ll.myAdd(50);
		ll.myClear();
		System.out.println(ll);
	}
	//EndOfMainMethod
}
class Node<T> 
{
	
}
class MyLinkedList<T> 
{Object []a=new Object[5];
int index=0;
	Node<T> head;
	public void myAdd(T data)
	{
		if(index>=a.length)
		//grow();
		a[index++]=data;
	}
	public void myClear()
	{
		//Object []temp=new Object[0];
	//	a=temp;
		index=0;
	}
	public String toString()
	{
		String s="[";
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
			s=s+a[i]+", ";
			else
			s=s+a[i];
		}
		s=s+"]";
		return s;
	}
}
