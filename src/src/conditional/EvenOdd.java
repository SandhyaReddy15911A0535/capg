package conditional;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+10);
		else
			System.out.println(a+15);
	}

}
