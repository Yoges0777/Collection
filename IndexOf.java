package LinkedListImplement;

public class IndexOf {

	public static void main(String[] args) 
	{
		Mylinkelist9 list=new Mylinkelist9 ();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		list.indexOf(10);
		System.out.println(list.indexOf(15));
	}
}
class Mylinkelist9
{
	node9 head;
	public void add(int data) 
	{
		node9 obj=new node9(data);
		if(head==null)
			head=obj;
		else
		{
			node9 temp=head;
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
		node9 temp=head;
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
	public int indexOf(int data) 
	{
		node9 temp=head;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
}
class node9
{
	int data;
	node9 next;

	node9(int data)
	{
		this.data=data;
	}
}