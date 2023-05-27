package LinkedListImplement;

public class Set {

	public static void main(String[] args) 
	{
		linkedlid11 list=new linkedlid11();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.set(2, 100);
		System.out.println(list);
	}
}
class linkedlid11
{
    node11 head;
	public void add(int data)
	{
		node11 obj=new node11(data);
		if(head==null)
		head=obj;
		else
		{
			node11 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	public String toString()
	{
		node11 temp=head;
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
	public void set(int index,int data)
	{
		node11 temp=head;
		int ind=0;
		if(index<0 || index>=ind)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		else
		{
			while(temp!=null)
			{
				if(ind==index)
				{
					temp.data=data;
				}
				ind++;
				temp=temp.next;
			}
		}
	}
}
class node11
{
	int data;
	node11 next;
     public node11(int data)
     {
    	 this.data=data;
     }
}