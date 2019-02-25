package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f,f1;
		try {
			int i,j=0; 
		//	String s="";
			char ch[]=new char[j];
			f = new FileInputStream("D:\\programscapg\\message.txt");
			f1= new FileInputStream("D:\\programscapg\\key.txt");
			try {
				while((i=f.read())!=-1)
				{
					//for()
            ch[i]= toCharArray((char)i);
					j++;
					System.out.println(ch[i]);
				 //	ch[i]=((char)i);
					
				//byte []b=s.getBytes();
					}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}

}
