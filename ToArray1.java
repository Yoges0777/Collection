package ArrayListImplemnt;

public class ToArray1 
{
	public static void main(String[] args) 
	{
		MyArrayList12<Integer> list=new MyArrayList12<>();
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
		int[] a=list.myToArray();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	//EndOfMainMethod
}
class MyArrayList12<T> 
{
	Object []a=new Object[5];
	int index=0;
	public void myAdd(T data) 
	{
		if(index>=a.length)
			grow();
		a[index++]=data;
	}
	int[] myToArray()
	{
		int []temp=new int [index];
		for(int i=0;i<index;i++)
		{
			temp[i]=(int)a[i];
		}
		return temp;
	}
	public void grow() 
	{
		Object []b=new Object[2*a.length];
		for(int i=0;i<index;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
}
