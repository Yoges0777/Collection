package LinkedListImplement;

public class LinkedListAddAtMethod {

	public static void main(String[] args)
	{
		MyLinkedList001 list1= new MyLinkedList001();
		list1.add(12); 
		list1.add(11); 
		list1.add(13); 
		list1.add(15); 
		list1.add(18); 
		System.out.println(list1);
		
//		list1.addAt(0, 100);
//		System.out.println(list1);
		list1.addAt(5,200);
		System.out.println(list1);
//		list1.addAt(8, 300);
//		System.out.println(list1);
	}
}
class MyLinkedList001
{
	Node001 head;
	public void add(int data) 
	{
		Node001 obj= new Node001 (data);
		
		if(head==null)
		{
			head=obj;
		    return;
		}
		else
		{
			Node001 temp= head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	public void addAt(int ind, int data)
	{
		if(ind<0)
		{
			throw new IndexOutOfBoundsException();
		}
		int index=0;
		Node001 temp= head;
		Node001 obj= new Node001(data);
		if(ind==0)
		{
			obj.next=head;
			head=obj;	
		}
		while(temp!=null)
		{
			if(index+1==ind)
			{
				obj.next=temp.next;
				temp.next=obj;
			}
			index++;
			temp=temp.next;
		}
		if(ind>index)
		throw new IndexOutOfBoundsException();
	}
	public String toString()
	{
		String s1="[";
		Node001 temp= head;
		while(temp!=null) 
		{
			if(temp.next!=null)
				s1+=temp.data+", ";
			else
				s1+=temp.data;
			temp=temp.next;
		}
		s1+="]";
		return s1;
	}

}
class Node001
{
	Node001 next;
	int data;
	public Node001(int data)
	{
		this.data=data;
	}

}