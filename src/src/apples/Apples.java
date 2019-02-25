package apples;

import java.util.Scanner;

public class Apples {
	
	
	static void calculate(int s,int t,int arr[],int orr[],int a,int o)
	{
		int x=0,y=0;
		for(int i=0;i<arr.length;i++)
		
		{
			if((a+arr[i])>=s &&(a+arr[i]<=t))
			{
				x++;
			}
		
			
		}
		System.out.println(x);
		for(int i=0;i<orr.length;i++)
			
		{
			if((o+orr[i])>=s &&(o+orr[i]<=t))
			{
				y++;
			}
		
			
		}
		System.out.println(y);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=0;
		System.out.println("enter the strting n ending");
		int s=sc.nextInt();
		int t=sc.nextInt();
		System.out.println("enter the aplles n organge tree pos");
		int a=sc.nextInt();
		int o=sc.nextInt();
		System.out.println("enter the size");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr[]=new int[n1];
		int orr[]=new int[n2];
		int num;
		//System.out.println("enter the size");
		//int size=sc.nextInt();
		System.out.println("enter the array1");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		System.out.println("enter the array2");
		for(int k=0;k<orr.length;k++)
		{
			orr[k]=sc.nextInt();
		}
		calculate(s,t,arr,orr,a,o);
		
		
		

	}

}
