package bank;

import java.util.Scanner;

public class Bank {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int user[]=
		System.out.println("enter number of accounts");
				 int n=sc.nextInt();
				 int kotak[]=new int[n];
				 long accno[][]=new long[n][n];
				 long adhar[][]=new long[n][n];
				 long balance[][]=new long[n][n];
				 long phno[][]=new long[n][n];
				// long accno,adhar,phno;
				
		
		for(int i=0;i<n;i++)
			
		{
			for(int j=1;j<n;j++)
			{
				//System.out.println("enter the details of customer");
			System.out.println("enter the acc num");
			int num=sc.nextInt();
			accno[i][j]=num;
					 
			
			System.out.println("enter the adhar num");
			int adharnum=sc.nextInt();
			adhar[i][j]=adharnum;
			
			
			
			System.out.println("enter the balance");
			int bal=sc.nextInt();
			balance[i][j]=bal;
			
			
			
			System.out.println("enter the ph num");
			int phone=sc.nextInt();
			phno[i][j]=phone;
			
			
			}
			
			
		}
		for(int i=1;i<kotak.length;i++)
		{
			for(int j=1;j<n;j++)
			{
				for(int k=1;k<n;k++) {
					System.out.println(accno[j][k]);
					System.out.println(adhar[j][k]);
					System.out.println(balance[j][k]);
					System.out.println(phno[j][k]);
					
				}
			
			
			
			
			}
			
			
		}
	}

}
