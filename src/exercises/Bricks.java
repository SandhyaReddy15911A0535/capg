package exercises;

import java.util.Scanner;

public class Bricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bricks");
		int bricks=sc.nextInt();
		int n1=0,s=0;
		for(int i=1;i<bricks;i++)
		{
			
			
				s=+s+i+(i*2);
			//	 n1=bricks-s;
			
		}	 
				 if(bricks>=s)
				 {
					 System.out.println("p");
				 
				 }
				 else
					 
					 System.out.println("m");
		}	
			
		
	}


