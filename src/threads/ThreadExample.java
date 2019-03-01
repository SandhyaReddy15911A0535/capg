package threads;

public class ThreadExample  extends Thread{

	public void run() {
		System.out.println("run method is called by start method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample th=new ThreadExample();
		th.start();

	}

}
