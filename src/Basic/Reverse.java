package Basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int rem;
		rem=a;
		while(a>0) {
	
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
			
		}
		System.out.println("the reverse ofnumber is"+sum);
	}

}
