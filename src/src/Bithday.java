import java.util.Scanner;

public class Bithday {
	static int max=0;
	static int x=0;
	static int candles(int arr[])
		{
		for(int j=0;j<arr.length;j++)
		{
			
			
			if(arr[j]>max)
			{
				max=arr[j];
			}
			
		
		//return max;
			//
		}
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]==max)
		{
			x++;
			}
		}
		//return System.out.println(x);
		return x;
		
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		int arr[]	=new int[age];
		System.out.println("enter ages");
				for(int i=0;i<arr.length;i++)
				{
					int num=sc.nextInt();
					arr[i]=num;
				}
				 candles(arr);
				 System.out.println(x);
	}

}
