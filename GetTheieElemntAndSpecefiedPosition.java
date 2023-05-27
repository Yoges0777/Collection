package Linkelist;
import java.util.*;
import java.util.function.Predicate;

public class GetTheieElemntAndSpecefiedPosition 
{

	public static void main(String[] args) {
		int[] a= {2,7,15,6};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}

		int cnt=0;
		cnt=(int) Math.sqrt(max);
		if(cnt*cnt==max)
		{
			System.out.println(max);
		}
		else
		{
			int num=getnum(max,0);
			System.out.println(num);
		}
	}

	private static int getnum(int max, int num) 
	{
		for(int i=1;i<1000;i++)
		{
			int n=i*i;
			if(getper(n))
			{
				if (n>max)
				return n;
			}		
		}
		return num;
	}

	private static boolean getper(int num) 
	{
		for(int i=1;i<num;i++)
		{
			if(i*i==num)
			{
				return true;
			}
		}
		return false;	
	}
}
