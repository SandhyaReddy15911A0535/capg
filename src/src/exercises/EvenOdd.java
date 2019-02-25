package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		EvenOdd e=new EvenOdd();
	//	e.accept1();
		e.evenOdd(e.accept1());
	}

	
		// TODO Auto-generated method stub
		public int[] accept1()
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
		public void evenOdd(int a[])
		{
			int x=0,y=0,count=0;
			int[] even=new int[12];
			int[] odd=new int[12];
			int[] d=new int[even.length+odd.length];
			for(int i=0;i<a.length;i++)
			{
				
				if(a[i] % 2==0)
				{
				
				 even[x]=a[i];
				 count++;
				 x++;
				// System.out.println(even[i]);
				 }
				else
				{
					odd[y]=a[i];
					y++;
				}
			}
			Arrays.sort(even);
			for(int i=0;i<even.length;i++)
			{
				System.out.println(even[i]);
			}
			
		
			/*Arrays.sort(odd);
			System.arraycopy(even, 0, d, 0, even.length);
			System.arraycopy(odd, 0, d, even.length, odd.length);
			
			for(int i=0;i<x+y;i++)
			{
				System.out.println(d[i]);
			}
			*/
		
			
				
		
			
		//	Arrays.sort(c);
			
		}
}


	



		

		
