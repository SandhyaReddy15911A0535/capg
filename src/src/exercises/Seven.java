package exercises;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seven s=new Seven();
	//	s.accept();
		s.logic(s.accept());
	}
	public int[] accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int num;
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			num=sc.nextInt();
			a[i]=num;
		}
		return a;
	}
	public void logic(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==7)
			{
				c++;
				continue;
			}
			System.out.println(a[i]);
			
		}
			//System.out.println(a[i]);
			for(int j=0;j<c;j++)
			{
				a[j]=7;
				System.out.println(a[j]);
			}
		
	}

}
