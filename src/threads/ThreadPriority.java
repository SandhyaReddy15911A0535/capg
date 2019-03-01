package threads;

public class ThreadPriority extends Thread {

	public void run()
	{
		System.out.println("thread name is "+Thread.currentThread().getName());
		System.out.println("thraed prority is "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setPriority(1);
		t1.start();
		
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		
		t3.setPriority(1);
		t3.start();

	}

}
