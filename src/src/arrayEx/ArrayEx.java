package arrayEx;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int num1=sc.nextInt();
		//int[] acc=new int[4];
		//acc[1]=123;
		//acc[3]=1234;
		// TODO Auto-generated method stub
	/*	for(int i=0;i<acc.length;i++)
		{
			System.out.println("enter the numbers");
			 int num=sc.nextInt();
			acc[i]=num;		}
		for(int i=0;i<acc.length;i++)
		{
			System.out.println(acc[i]);
		}*/
		System.out.println("enter rows n clomn");;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int dm[][]=new int[row][col];
		
		System.out.println("enter the elements");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				 int num1=sc.nextInt();
				dm[i][j]=num1;
						
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				System.out.print(dm[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
