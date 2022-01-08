package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1,"Piyush");
		map1.put(2,"Suresh");
		map1.put(3,"Ram");
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1, "Piyush");
		map2.put(2, "Suresh");
		map2.put(3, "Ram");
		
		HashMap<Integer,String> map3=new HashMap<Integer,String>();
		map3.put(1,"Piyush");
		map3.put(2,"Suresh");
		map3.put(3, "Ram");
		map3.put(3, "Ram");
		
		System.out.println(map1);
		Iterator <Integer> it=map1.keySet().iterator();
		System.out.println("-------------------");
		while(it.hasNext()){
			Integer key=it.next();
			String Value=map1.get(key);
			System.out.println("Key = "+key+" Value = "+Value);
		}
		
		System.out.println("---------------");
		
		Iterator<Entry<Integer,String>> it1=map1.entrySet().iterator();
		while(it1.hasNext()){
			Entry<Integer,String> entry=it1.next();
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		System.out.println("---------------");
		
		System.out.println(map1.equals(map2));
		
		System.out.println("---------------");
		
		System.out.println(map1.equals(map3));
		
		System.out.println("---------------");
		
		System.out.println(map1.keySet().equals(map3.keySet()));
		//This method will ignore dupliate keys
	}
}
