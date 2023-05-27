package LinkedListImplement;

public class Contains {

	public static void main(String[] args) 
	{
		linkedlist6 list=new linkedlist6();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		
		list.contains(10);
		System.out.println(list.contains(60));
	}

}
class node7
{
	int data;
	node7 next;
	public node7(int data)
	{
		this.data=data;
	}
}
class linkedlist6
{
	node7 head;
	public void add(int data) 
	{
		node7 obj=new node7 (data);
		if(head==null)
		head=obj;
		else
		{
			node7 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	
	public String toString()
	{
		String s="[";
		node7 temp=head;
		while(temp!=null)
		{
			if(temp.next!=null)
				s=s+temp.data+", ";
			else
				s=s+temp.data;	
			
			temp=temp.next;
		}
		s=s+"]";
		return s;
	}
	public boolean contains(int data) 
	{
		node7 temp=head;
		while(temp.next!=null)
		{
			if(temp.data==data)
			return true;
			temp=temp.next;
		}
		return false;
	}
}