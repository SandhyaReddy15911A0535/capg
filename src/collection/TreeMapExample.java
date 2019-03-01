package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String> tm=new TreeMap<>();
tm.put(12,"a");
tm.put(13,"a");
tm.put(12,"ac");
tm.put(141,"avb");
tm.put(15,"aty");
//for(Map.Entry m:tm.entrySet())
//{
	//System.out.println(m.getKey()+" "+m.getValue());
//}
//System.out.println( ((Object) tm).getKey());
Set<Entry<Integer,String>> set1 = tm.entrySet();
System.out.println(set1);
//Iterator<Integer> iterator=((tm) set1).getValues();


	}

}
