package LinkedListImplement;

public class GetMethod {

	public static void main(String[] args)
	{
	   Linkedlist12 list=new Linkedlist12();
	   list.add(10);
	   list.add(11);
	   list.add(11);
	   list.add(13);
	   list.add(14);
	   list.add(15);
	   System.out.println(list.get(5));
	}
}
class Linkedlist12
{
	node12 head;
	int cnt=0;
	public void add(int data) 
	{
		node12 obj=new node12(data);
		if(head==null)
		{
		head=obj;
		cnt++;
		}
		else
		{
			node12 temp=head;
			while(temp.next!=null)
			{
			 temp=temp.next;	
			}
			temp.next=obj;
			cnt++;
		}
	}
	public int get(int index)
	{
		node12 temp=head;
		int ind=0;
		if(index<0 || index>cnt)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		while(temp!=null)
		{
			if(ind==index)
			{
				return temp.data;
			}
			ind++;
			temp=temp.next;
		}
		return -1;
	}
}
class node12
{
	node12 next;
	int data;
	node12(int data)
	{
		this.data=data;
	}
}