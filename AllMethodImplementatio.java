package LinkedListImplement;

import javax.security.auth.callback.LanguageCallback;

public class AllMethodImplementatio<T> 
{
	Node1<T>head;  
	int cnt=0;
	public void myadd(T data)
	{
        Node1 <T> obj=new Node1<T>(data);
        if(head==null)
        {
           head=obj;
           cnt++;
        }
        else
        {
        	Node1<T>temp=head;
            while(temp.next!=null)
            {
            	temp=temp.next;
            }
            cnt++;
            temp.next=obj;
        }
	}
	public String toString()
	{
		String s="[";
		Node1<T>temp=head;
		while(temp!=null)
		{
			if(temp.next!=null)
				s=s+temp.data+", ";
			else
				s=s+temp.data;
		}
		s=s+"]";
		return s;
	}
	//clear method
	public void clear()
	{
		head=null;
	}
	//isEmpty
	public boolean isEmty()
	{
		
		if(head==null)
		{
			return true;
			
		}
		return false;
	}
	//Contains 
	public boolean contains(T data)
	{
		Node1<T>temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	//size method
	public int mySize()
	{
		return cnt;
	}
	
	//myGet method//
	public Object myGet(int index)
	{
		int ind=0;
		if(index<0 || index>=cnt)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		else
		{
			Node1<T>temp=head;
			while(temp!=null)
			{
				if(index==ind)
				{
					return temp.data;
				}
				ind++;
				temp=temp.next;
			}
		}
		return ind;
	}
	//clone
//	public Object myclone()
//	{
//		MyLinkedList1<Object>list=new MyLinkedList1<Object>();	
//		Node1<T>temp=head;
//		while(temp!=null)
//		{
//			ll.myadd(temp.data);
//			temp=temp.next;
//		}
//		return cnt;
//	}
	//set method
	public void set(int index,T data)
	{
		int ind=0;
		if(index<0 ||index>=cnt)
		{
			System.out.println("index out of range");
			System.exit(0);
		}
		else
		{
			Node1<T>temp=head;
			while(temp!=null)
			{
				if(index==ind)
				{
					temp.data=data;
				}
				ind++;
				temp=temp.next;
			}
		}
	}
	
	//indexOf  method;
	public int name(T data) 
	{
		int ind=0;
		Node1<T>temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
			  return ind;	
			}
			ind++;
			temp=temp.next;
		}
		return -1;
	}
	
	// AddAt method
	public void addAt(int index,T data)
	{
		int ind=0;
		Node1<T>newObj=new Node1<T>(data);
		if(index<0 || index>cnt)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		if(index==0)
		{
		    newObj.next=head;
		    head=newObj;
		    return ;
		}
		else
		{
			Node1<T>temp=head;
			while(temp!=null)
			{
			  if(index-1==ind)
			  {
				  newObj.next=temp.next;
				  temp.next=newObj;
				  return ;
			  }
			  ind++;
			  temp=temp.next;
			}
		}
	}
	
	//remove method-
	public void remove(int index)
	{
		int ind=0;
		Node1<T>temp=head;
		if(index<0 || index>=cnt)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			while(temp!=null)
			{
				if(index-1==ind)
				{
					temp.next=temp.next.next;
				}
				ind++;
				temp=temp.next;
			}
		}
	}
}