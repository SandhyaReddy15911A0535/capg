package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import sandhya.Student;

public class SerializabeEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("saopk");
		student.setClg("gjhj");
		student.setFees(123);
		
FileOutputStream file;
try {
	file = new FileOutputStream("d://programscapg//serial.txt");
	ObjectOutputStream out=new ObjectOutputStream(file);
	out.writeObject(student);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
