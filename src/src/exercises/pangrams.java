package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
			
			char ch[]=s.toCharArray();
		
		
		
		//for(int i=0;i<ch.length;i++)
		//System.out.println(ch[i]);
		
		TreeSet<Character> ts=new TreeSet<>();
		TreeSet<Character> ts1=new TreeSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]!=' ')
			ts.add(ch[i]);
		}
		
		
		//System.out.println(ts);
		for(int i=97;i<123;i++)
		{
			ts1.add((char)i);
		}
		//System.out.println(ts1);
		if(ts1.equals(ts))
			System.out.println("pangrams");
		else
			System.out.println("not a panagrams");
	}

}
