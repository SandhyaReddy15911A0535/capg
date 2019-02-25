package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try {
	FileOutputStream f1=new FileOutputStream("d://programscapg//second.txt");
	System.out.println("enter name");
	String s=sc.next();
	byte []b=s.getBytes();
//	System.out.println(b);
	try {
		f1.write(b);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		f1.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
		
	}

	

}
