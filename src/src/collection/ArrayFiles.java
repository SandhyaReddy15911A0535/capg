package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream f1;
		ArrayList al1=new ArrayList();
		StringBuffer str=new StringBuffer();
		try {
			f1 = new FileInputStream("d://programscapg//Arrays.txt");
			while((i=f1.read())!=-1)
			{
				if(f1.read()!='-')
					str.append(f1.read());
					//continue;
					//System.out.println(i);
				//else
					//al1.add(i);
				//System.out.println(al1);
			}

		}
		
catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(al1);
		System.out.println(str);
		
	}

}
