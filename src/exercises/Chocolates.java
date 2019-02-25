package exercises;

import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of friends");
		int n=sc.nextInt();
		System.out.println("enter the no chocolates in packet");
		int c=sc.nextInt();
		if(c%n==0)
			System.out.println("yes");
		else
			
			System.out.println("no");

	}

}
