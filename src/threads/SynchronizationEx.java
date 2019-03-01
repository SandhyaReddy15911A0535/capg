package threads;

class Parent{
	
	 synchronized void printtable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}
class Child1 extends Thread
{
	Parent p;
	Child1(Parent p)
	{
		this.p=p;	
		}
	
	public void run()
	{
		p.printtable(4);
	}
	
	
}
class Child2 extends Thread
{
	Parent p;
	Child2(Parent p)
	{
		this.p=p;	
		}
	public void run()
	{
		p.printtable(6);
	}
	
}
public class SynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
Child1 ch1=new Child1(p);
Child2 ch2=new Child2(p);
ch1.start();
ch2.start();


	}

}
