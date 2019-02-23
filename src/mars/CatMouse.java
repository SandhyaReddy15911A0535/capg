package mars;

import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the positions");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if((x-z)<(y-z))
			System.out.println("cat B");
		else if((x-z)>(y-z))
			System.out.println("cat A");
		else
		{
		 if ((z-x)==(z-y))
			System.out.println("mouse c");
		
		}
		

	}

}
