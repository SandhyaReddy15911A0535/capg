package exercises;

import java.util.Scanner;

public class ProfilePic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the l,w,h");
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		if(w<l||h<l)
		{
			System.out.println("upload another");
		}
		else
		{
			if(w>l&&h>l)
			{
				System.out.println("accept");
				
			}
			else
				System.out.println("crop it");
				
		}
		

	}

}
