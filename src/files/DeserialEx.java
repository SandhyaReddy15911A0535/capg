package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import sandhya.Student;

public class DeserialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream file;
try {
	file = new FileInputStream("d://programscapg//serial.txt");
	ObjectInputStream in=new ObjectInputStream(file);
	Student s=(Student)in.readObject();
	System.out.println(s.getName()+" "+s.getClg());
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//ObjectInputStream in=new ObjectInputStream(file);
//Student s=(Student)in.readObject();
//System.out.println(s.getName());
 catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
