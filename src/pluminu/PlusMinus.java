package pluminu;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		 double x=0,y=0,z=0;
		
		int arr[] =new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
		
		//for(int j=0;j<n;j++)
		//{
			// int x=0,y=0,z=0;
			
			if(arr[i]<0)
			{
				x++;
				//System.out.println(x);
				
			}
			else if(arr[i]>0)
			{
				y++;
				}
			else
			{
				z++;
				}
		
		
		}
		System.out.println("% of zeros are:"+ (x/n));
		System.out.println("% of positives are:"+ (y/n));
		System.out.println("% of negitives are:"+ (z/n));
		
		
		

}

}
