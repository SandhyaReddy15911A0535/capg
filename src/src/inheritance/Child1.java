package inheritance;

public class Child1 extends Parent1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Anusha";
		Child1 c1=new Child1();
		c1.show();
		
		System.out.println("Daughter :"+c1.surname+"."+ name +" "+c1.last);
	}

}
