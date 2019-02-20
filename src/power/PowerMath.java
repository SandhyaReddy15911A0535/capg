package power;

import java.util.Scanner;


public class PowerMath {
	static void power(int a[],int b[])
	{ 
		int c[] =new int[a.length];
		for(int k=0;k<a.length;k++)
		{
			c[k]=a[k]+b[k];
			
			
		
		System.out.println(c[k]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elements1");
		int num1,num2;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			num1=sc.nextInt();
			a[i]=num1;
		}
		
		System.out.println("enter the elements2");
		int b[]=new int[n];
		
		
		
		for(int j=0;j<b.length;j++)
		{
			num2=sc.nextInt();
			a[j]=num2;
		}
		power(a,b);
		

	}

}
