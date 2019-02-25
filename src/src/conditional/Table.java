package conditional;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		while(i<11) {
			System.out.println(a+" x "+i+" = "+(a*i));
			i++;
		}
	}

}
