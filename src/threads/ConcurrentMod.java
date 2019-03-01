package threads;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentMod  extends Thread{
static ArrayList al=new ArrayList();

	public void run()
	{
		al.add(34);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
al.add(12);
al.add(10);
al.add(45);

ConcurrentMod  c=new ConcurrentMod();
c.start();
Iterator i=al.iterator();
while(i.hasNext())
{
	System.out.println(al);
}

	}

}
