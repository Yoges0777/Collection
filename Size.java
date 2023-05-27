package ArrayListImplemnt;

public class Size 
{
	public static void main(String[] args) 
	{
		Arraylist5<Integer> list=new Arraylist5<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(33);
		list.add(44);
		list.add(55);
		
		System.out.println(list.mySize());
	}
}
class Arraylist5<T>
{
	private Object []a=new Object[5];
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
		return null;
	}
	int mySize()
	{
		for(int i=0;i<index;i++)
		{
			return index;
		}
		return 0;
		
	}
}
