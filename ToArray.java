package ArrayListImplemnt;

import java.util.Arrays;

public class ToArray 
{
	public static void main(String[] args) 
	{
		Arraylist7<Integer> list=new Arraylist7<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(33);
		list.add(44);
		list.add(55);
		
		
		System.out.println(list);
		
		Object []a=list.toArray();
		System.out.println(Arrays.toString(a));
	}
}
class Arraylist7<T>
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
	public Object[]toArray()
	{
		Object[]temp= new Object [index];
		for(int i=0;i<index;i++)
		{
			temp[i]=a[i];
		}
		return temp;
	}
}
