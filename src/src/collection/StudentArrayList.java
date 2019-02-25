package collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import sandhya.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(setInfo());
		FileOutputStream file;
		try {
			file = new FileOutputStream("d://student123.txt");
			out = new ObjectOutputStream(file);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ObjectOutputStream out;
		try {
		//	out = new ObjectOutputStream(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			out.writeObject(al);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static Student setInfo()
	{
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("enter the details");
		s1.setName(sc.next());
		s1.setClg(sc.next());
		s1.setFees(sc.nextDouble());
		
		return s1;
	}
}
