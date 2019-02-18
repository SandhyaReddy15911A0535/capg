package inheritance;

public class GrandFather {
	String surname="Gangasani";
	String gname="Shankar";
	String last="reddy";
	public GrandFather() {
		// TODO Auto-generated constructor stub
		System.out.println("THIS IS A GRANDPARENT CONSTRUCTOR");
	}
	public void show() {
		System.out.println("GrandFather :"+ surname+"."+gname +" "+ last);
	}

}
