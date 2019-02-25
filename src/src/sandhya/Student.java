package sandhya;

import java.io.Serializable;
//implements Serializable
public class Student implements Comparable<Student> {
	public String name;
	public int roll ;
	private String clg;
	private double fees;

	

	public Student(String name, int roll, int fees, String clg) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.roll=roll;
		this.clg=clg;
		this.fees=fees;
	}


	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getRoll() {
	return roll;
}


public void setRoll(int roll) {
	this.roll = roll;
}


public String getClg() {
	return clg;
}


public void setClg(String clg) {
	this.clg = clg;
}


public double getFees() {
	return fees;
}


public void setFees(double fees) {
	this.fees = fees;
}


	public static void main(String[] args) {
		//Student s1=new Student();
		/*Student s2=new Student();
		Student s3=new Student();
		s1.setName("sandhya");
		s2.setName("sandhya");
		s3.setName("sandhya123");
		
		 System.out.println(s1.getName());
		 System.out.println(s2.getName());
		 System.out.println(s3.getName());*/
		
	
		
		
		
		// TODO Auto-generated method stub

	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(roll==o.roll)
			return 0;
		else if(roll>o.roll)
			return 1;
		else
			return -1;
		
	}

}
