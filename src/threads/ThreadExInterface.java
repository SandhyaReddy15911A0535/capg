package threads;

public class ThreadExInterface  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExInterface th=new ThreadExInterface();
		Thread th1=new Thread(th);//need to pass the object if current class to Thread class
		th1.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method is called by start method");
		
	}

}
