package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<10e5;i++)
		{
			l1.add(i);
		}
		
long start=System.currentTimeMillis();
for(int i=0;i<10e5;i++)
{
	l1.add(i);
}
l1.add(2,21);
//l1.addLast(234);
//l1.addFirst(123);

long end=System.currentTimeMillis();
System.out.println(end-start);
	}

}
