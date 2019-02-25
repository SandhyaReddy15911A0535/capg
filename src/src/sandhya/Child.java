package sandhya;

public class Child  implements Father,Mother{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.name();

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("sandhya");
		
	}

}
