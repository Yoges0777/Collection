package ArrayListImplemnt;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSortDifferentFromAnother {

	public static void main(String[] args)
	{
		student00 s1=new student00 (001,"amol",40);
		student00 s2=new student00 (001,"yogesh",30);
		student00 s3=new student00 (001,"ganya",60);
		student00 s4=new student00 (001,"namya",50);
		ArrayList<student00>al=new ArrayList<student00>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).marks>al.get(j).marks)
				{
					student00 temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);	
	}
}
class student00 
{
	int rn;
	String name;
	int marks;
	public student00(int rn, String string, int marks) 
	{
		this.marks=marks;
		this.rn=rn;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "student00 [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}
}