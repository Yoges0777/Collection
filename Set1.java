package LinkedListImplement;

public class Set1
{
		public static void main(String[] args) 
		{
			MyLinkedList<Integer> ll=new MyLinkedList<>();
			ll.myAdd(10);
			ll.myAdd(20);
			ll.myAdd(30);
			ll.myAdd(40);
			ll.myAdd(50);
			ll.myAdd(30);
			ll.myAdd(40);
			ll.myAdd(50);
			ll.mySet(2, 100);
			System.out.println(ll);
		}
	}
	class Node<T>
	{
		T data;
		Node<T>next;
		Node (T data)
		{
			this.data=data;
		}
	}
	class MyLinkedList<T> 
	{
		int cnt=0;
		Node<T>head;
		public void myAdd(T data)
		{
			Node<T>obj=new Node<T>(data);
			if(head==null)
			{
				head=obj;
				cnt++;
			}
			else
			{
				Node<T>temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				cnt++;
				temp.next=obj;
			}
		}
		public void mySet(int index,T data)
		{
			Node<T>temp=head;
			Node<T>newObj=new Node<T>(data);
			int ind=0;
			if(index<0 || index>cnt)
			{
				System.out.print("index out of range");
				System.exit(0);
			}
			else
			{
				while(temp!=null)
				{
					if(ind==index)
					temp.data=data;
					ind++;
					temp=temp.next;
				}
			}
		}
		public String toString()
		{
			Node<T>temp=head;
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
}
