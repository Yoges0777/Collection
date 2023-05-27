package LinkedListImplement;

public class size {

	public static void main(String[] args)
	{

		Mylinkedlist4 list=new Mylinkedlist4();
		list.add(11);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list.size());

	}

}
class node5
{
	int data;
	node5 next;
	node5 (int data)
	{
		this.data=data;
	}
}
class Mylinkedlist4
{
 node5 head;
 int cnt=0;
	public void add(int data) 
	{
		node5 obj=new node5(data);
		if(head==null)
		{
			head=obj;
			cnt++;
		}
		else
		{
			node5 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
			cnt++;
		}
	}
	public String toString()
	{
		String s="[";
		node5 temp=head;
		while(temp!=null)
		{
			if(temp.next!=null)
				s+=temp.data+", ";
			else
				s=s+temp.data;
			
			
			temp=temp.next;
		}
		s=s+"]";
		return s;
	}
	public int size()
	{
		return cnt;
		
	}
}


