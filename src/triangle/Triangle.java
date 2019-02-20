package triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the sides");
			try
			{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(c*c==a*a+b*b||b*b==a*a+c*c||a*a==b*b+c*c)
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
			}
			catch(Exception e)
			{
				
			}
			

	}

}
