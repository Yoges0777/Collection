package ArrayListImplemnt;

public class AddAndToString 
{

	public static void main(String[] args) 
	{
		MyArrayList<Integer> list=new MyArrayList<Integer>();
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		list.myAdd(44);
		list.myAdd(55);
		list.myAdd(11);
		list.myAdd(22);
		list.myAdd(33);
		list.myAdd(44);
		list.myAdd(55);

		System.out.println(list);	
	}
}
class MyArrayList<T>
{
	 Object[]a=new Object[5];
	 int index=0;

	public void myAdd( T data)
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
		String s1="[";
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
				s1=s1+a[i]+", ";
			else
				s1=s1+a[i];
		}
		s1=s1+"]";
		return s1;
	}


}




