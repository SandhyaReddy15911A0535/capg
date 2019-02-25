package sandhya;

public abstract class Operation1 {
public abstract void add();
public abstract void sub();
public void display() { 
	System.out.println("concrete");
}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation1 o=new Calc1();
		o.add();

	}
}
	class Calc1 extends Operation1
	{
	



	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
		
	}


	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
		
	}
	
	}



