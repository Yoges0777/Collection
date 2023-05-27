package LinkedListImplement;

public class lastIndexOf {

	public static void main(String[] args)
	{
	  linkedList20 list1=new linkedList20();
	  list1.add(10);
	  list1.add(11);
	  list1.add(12);
	  list1.add(13);
	  list1.add(14);
	  list1.add(15);
	  
	  System.out.println(list1.lastindex(15));
	  
	}
}
class linkedList20
{
	node20 head;
	public void add(int data) 
	{
		node20 obj=new node20(data);
		if(head==null)
			head=obj;
		else
		{
			node20 temp=head;
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
		node20 temp=head;
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
	public int lastindex(int data)
	{
		node20 temp=head;
		int index=0;
		int myindex=-1;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				myindex=index;
				return myindex;
			}
			index++;
			temp=temp.next;
		}
		return myindex;
		
	}
}
class node20
{
	int data;
	node20 next;
	node20(int data)
	{
		this.data=data;
	}
}