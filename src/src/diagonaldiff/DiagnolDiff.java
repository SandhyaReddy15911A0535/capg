package diagonaldiff;

import java.util.Scanner;

/*public class A {
	public void calculate(int[][] dm,int row,int col ) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				int sum=0;
				if(i==j)
				{
					
			}
		}
			}
		
		
	}
	
}*/
public class  DiagnolDiff
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
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
			 DiagnolDiff d=new  DiagnolDiff();
			 d.calculate(dm,row,col);
		}

	

	private void calculate(int[][] dm, int row, int col) {
		
		int sum=0;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++)
			{
				
				if(i==j)
				{
					sum=sum+dm[i][j];
				}
				
		// TODO Auto-generated method stub
			}
			
			
		
		
	}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<row;i--)
		{
			for(int j=col;j>col;j++)
			{
				if(i==j)
				{
				sum1=sum1+dm[i][j];
				}
			}
		}
		System.out.println(sum1);
		
}
}
