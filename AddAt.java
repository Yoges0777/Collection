package ArrayListImplemnt;

public class AddAt 
{
	public static void main(String[] args) 
	{
		Arraylist10<Integer> list=new Arraylist10<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(33);
		list.add(44);
		list.add(55);
		
		list.AttoString(1, 100);
		System.out.println(list);
	}
}
class Arraylist10<T>
{
	private Object[]a=new Object [5];
	private int index=0;
	
	public void add(T data)
	{
		if(index>=a.length)
			grow();
			a[index++]=data;
	}
	
	
	public void grow() 
	{
		Object []b=new Object[2*a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
			s=s+a[i]+", ";
			else
			s=s+a[i];
		}
		s=s+"]";
		return s;	
	}
	public void AttoString(int ind,int data)
	{   int index=0;
		if(ind<0 || ind>=index)
		{
			System.out.println("out of range");
			System.exit(0);
		}
		if(index>=a.length)
			grow();
		for(int i=index;i>ind;i--)
		{
			a[i]=a[i-1];
		}
		a[ind]=data;
		index++;
	}
}
