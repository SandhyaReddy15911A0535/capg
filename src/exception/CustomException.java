package exception;

public class CustomException extends Exception {
	CustomException()
	{
		System.err.println("user defined exception");
		System.out.println("user defined exception2");
	}

}
