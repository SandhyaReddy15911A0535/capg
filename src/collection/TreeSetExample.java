package collection;

import java.util.Iterator;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(90);
		ts.add(234);
		ts.add(12);
		ts.add(134);
		//ts.add(null); throws an exception becoz it sorts the elemnts
		ts.add(1);
		Iterator<Integer>iterato=ts.iterator();
		while(iterato.hasNext())
		{
			System.out.println(iterato.next());
		}

	}

}
