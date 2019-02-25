package collection;

import java.util.ArrayList;
import java.util.Collections;

import sandhya.Student;

public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student("sandhya",5355,456,"vjit"));
al.add(new Student("sndy",5351,4567,"vjit"));
Collections.sort(al);
for(Student st:al)
	System.out.println(st.roll+"  "+st.name);


	}

}
