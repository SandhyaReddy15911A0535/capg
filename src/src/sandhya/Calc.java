package sandhya;

public class Calc implements Operation {

	public static void main(String[] args) {
		Calc c=new Calc();
		c.add(12, 16);
		c.sub(12,10);
		
		// TODO Auto-generated method stub

	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}
	

}
