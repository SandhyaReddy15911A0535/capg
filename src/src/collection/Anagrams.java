package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings");
		String s1=sc.next();
		String s2=sc.next();
		ArrayList<Character>al=new ArrayList<>();
		ArrayList<Character>al1=new ArrayList<>();
		//al.add("silent");
		
	//	al.add("listen");
		//al.toArray();
		//System.out.println(al);
		char[] ch1=s1.toCharArray();
		
		char[] ch2=s2.toCharArray();
		for(int i=0;i<ch1.length;i++)
			{
			al.add(ch1[i]);
		}
		
		//System.out.println(al);
for(int i=0;i<ch2.length;i++)
			
		{
			al1.add(ch2[i]);
		}
Collections.sort(al);
Collections.sort(al1);
System.out.println(al);
System.out.println(al1);
if(al1.equals(al))
	System.out.println("anagrams");
else 
	System.out.println("not an anagram");
		

	}

}
