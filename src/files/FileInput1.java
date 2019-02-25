package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream f1;
try {
	int i;
	f1 = new FileInputStream("d://programscapg//second.txt");
	try {
		while((i=f1.read())!=-1)
		{
System.out.println((char)i);
		}
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
