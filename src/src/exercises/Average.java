package exercises;

import java.util.Scanner;

public class Average {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		Average av=new Average();
		
		greater(a);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		double num;
		System.out.println("enter elements");
		double[] a=new double[size];
		for(int i=0;i<a.length;i++)
		{
			num=sc.nextInt();
			a[i]=num;
		}
		
	}
	

	private  static void greater(double a) {
		double sum=0;
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/size;
		
		//System.out.println(avg);
		for(int i=0;i<size;i++)
		{
		if(a[i]>avg)
			System.out.println(a[i]);
		}
	}

}
