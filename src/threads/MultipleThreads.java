package threads;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("thread1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	class Thread2 extends Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
				System.out.println("thread2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}

public class MultipleThreads  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 thread1=new Thread1();
Thread2 thread2=new Thread2();
thread1.start();
thread2.start();
	}

}
