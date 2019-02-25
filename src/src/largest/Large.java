package largest;

import java.util.Arrays;
import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int num;
		for(int i=0;i<a.length;i++)
		{
			num=sc.nextInt();
			a[i]=num;
		}
		//int b[]=new int[size];
		
		Arrays.sort(a);
		System.out.println("enther the position of smalest element");
		int s=sc.nextInt();
		
		System.out.println(a[s-1]);
		System.out.println("enther the position of largest element");
		int l=sc.nextInt();
		System.out.println(a[size-l]);
		
		
		

	}

}
