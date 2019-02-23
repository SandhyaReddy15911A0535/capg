package mars;

import java.util.Scanner;

public class Mars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the signal");
String s=sc.next();

int l=s.length();
//char []ch=new char[];
char [] ch=s.toCharArray();
int count=0,cor=0;
int n=ch.length /3;
//System.out.println(n);
//	System.out.print(ch[i]);
	
		for(int i=0;i<l;i++)
		{
		if(ch[i]=='s'&&ch[i+1]=='o'&&ch[i+2]=='s')
		{
			count++;
		//	i++;
			i=i+2;
		}
		
		}
		

	System.out.println(count-n);
	
	}
	

}
