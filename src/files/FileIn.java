package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f1=new FileInputStream("d://programscapg//demo.txt");
		
				System.out.println(f1.read());
				
				f1.close();
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
