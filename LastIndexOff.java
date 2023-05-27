package ArrayListImplemnt;

public class LastIndexOff {

	public static void main(String[] args) 
	{
		MyArrayList3<Integer> list=new MyArrayList3<Integer>();
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		list.myAdd(44);
		list.myAdd(55);
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		System.out.println(list.myLastIndexOf(-3));
	}
}
class MyArrayList3<T>
{
	private Object []a=new Object[5];
	int index=0;
	public void myAdd( T data)
	{
		if(index>=a.length)
			grow();
		a[index++]=data;
	}
	int myLastIndexOf(T data) 
	{
		for(int i=index;i<0;i--)
		{
		 if(a[i]==data)	
			 return i;
		}
		 return -1;
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
		String s="[";
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
}