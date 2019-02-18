package Basic;

import java.util.Scanner;

public class Arithematic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		String ch=sc.next();
	switch(ch) {
	case "+": System.out.println("addition is:"+(a+b));
	break;
	case "-": System.out.println("addition is:"+(a-b));
	break;
	case "*": System.out.println("addition is:"+(a*b));
	break;
	case "/": System.out.println("addition is:"+(a/b));
	break;
	default : System.out.println("choose a valid operator");
		
	}
	}
	}

