package LinkedListImplement;

public class Clone {
	public static void main(String[] args) 
	{
		linkedlist8 list=new linkedlist8();
		list.Myadd(10);
		list.Myadd(10);
		list.Myadd(10);
		list.Myadd(10);
		list.Myadd(10);
		Object clone=list.clone();
		System.out.println(clone);
	}
}
class node8
{
	int data;
	node8 next;
	node8(int data)
	{
		this.data=data;
	}
}
class linkedlist8
{
	node8 head;
	public void Myadd(int data)
	{
		node8 obj=new node8(data);
		if(head==null)
			head=obj;
		else
		{
			node8 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	public String toString()
	{
		node8 temp=head;
		String s="[";
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
	public Object clone()
	{
		linkedlist8 list=new linkedlist8();
		node8 temp=head;
		while(temp!=null)
		{
			list.Myadd(temp.data);

			temp=temp.next;
		}
		return list;
	}
}