package exception;

public class ExceptionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		int arr[]= {12,12,123};
	try
		
		{
			System.out.println(2/0);
		}
	
		
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
		
		
		System.out.println("end");

	}

}
