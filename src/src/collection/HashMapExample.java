package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<>();
hm.put(12,"a");
hm.put(13,"b");
hm.put(12,"ac");
hm.put(141,"aed");
hm.put(15,"asds");
for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
	}

//HashSet<String> hashset=new HashSet<>(hm.values());
//System.out.println(hashset);


}
}
