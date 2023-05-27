package ArrayListImplemnt;

public class IsEmpty 
{
	public static void main(String[] args) 
	{
		Arraylist4<Integer> list=new Arraylist4<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(33);
		list.add(44);
		list.add(55);

		System.out.println(list.isEmpty());
	}
}
class Arraylist4<T>
{
	
	private Object[]a=new Object[5];
	private int index=0;
	public void add(T data)
	{
		if(index>=a.length)
			grow();
			a[index++]=data;
	}
	public void grow() 
	{
		 Object[]b=new Object[2*a.length];
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
	public boolean isEmpty()
	{
		if(index==0)
		{
			return true;
		}
		return false;
		
	}
	
	
}
