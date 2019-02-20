package sandhya;

import java.util.Scanner;

public class PassingObj {
	Student s1=new Student();
	Student s=new Student();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		PassingObj obj=new PassingObj();
		s=obj.accept();
		obj.display();
		

	}
	public Student accept( Student s1)
	{
		//System.out.println("enter name");
		s1.setName("sandhya");
		//System.out.println("enter clg name");
		s1.setClg("vjit");
		//System.out.println("enter fees");
		s1.setFees(98577);
		//System.out.println("enter roll num");
		s1.setRoll(535);
		return s1;
		
		
	}
	public void display()
	{
		System.out.println(s1.getClg());
		System.out.println(s1.getFees());
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
	}

}
