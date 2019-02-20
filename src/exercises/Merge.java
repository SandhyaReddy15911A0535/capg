package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Merge m=new Merge();
		//	s.accept();
			//s.logic(s.accept());
			m.accept1();
			//m.logic(a[],b[]);
			//m.logic(m.accept1());
			m.accept2();
			m.logic(a[],b[]);
		}
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
			Arrays.sort(a);
			return a;
		}
		public int[] accept2()
		{
			int num1;
			Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
			int size1=sc.nextInt();
			System.out.println("enter elements");
			int[] b=new int[size1];
			for(int j=0;j<b.length;j++)
			{
				num1=sc.nextInt();
				b[j]=num1;
			}
			
			Arrays.sort(b);
			//return a;
			return b;
		}
		public void logic(int a[],int b[])
		{
			int[] c=new int[10];
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i];
				System.out.println(c[i]);
			}
			for(int j=a.length;;j++)
			{
				c[j]=b[j];
			
			System.out.println(c[j]);
			}
			
		}

	}


