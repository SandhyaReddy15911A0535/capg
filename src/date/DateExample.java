package date;

import java.util.Date;

public class DateExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long milli=123456789;
		System.out.println(date);
		Date date1=new Date(milli);
		System.out.println(date1);

	}

}
