package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs=new HashSet<>();
hs.add(23);
hs.add(12);
hs.add(123);
hs.add(null);
hs.add(234);
hs.add(234);
Iterator<Integer> iterator=hs.iterator();
while(iterator.hasNext())
{
	System.out.println(iterator.next());
}
	}

}
