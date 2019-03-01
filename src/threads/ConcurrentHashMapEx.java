package threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConcurrentHashMap chm=new ConcurrentHashMap();
chm.put(101,"A");
chm.put(102,"B");
chm.putIfAbsent(101,"c");
chm.remove(101,"A");
chm.put(103,"D");
chm.replace(103,"D","E");
System.out.println(chm);
	}

}
