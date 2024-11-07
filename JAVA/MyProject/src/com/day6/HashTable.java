package com.day6;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(10, "Java");
		ht.put(7, "Python");
		ht.put(3, "C#");
		ht.put(101, "C++");
//		ht.put(null, "PHP");
		
		System.out.println(ht);
		
		System.out.println(ht.get(101));
		
//		ht.remove(null);
		System.out.println(ht);
		
		//Traversing Map
        //Way-1
		System.out.println("============");
		Set<Integer> keys = ht.keySet();
		System.out.println(keys);
		for(Integer k : keys) {
			System.out.println(k + "=>" + ht.get(k));
		}
		
		//Way-2
		System.out.println("============");
		Set<Entry<Integer, String>> en = ht.entrySet();
		System.out.println(en);
		Iterator<Entry<Integer, String>> it = en.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> ent = it.next();
			System.out.println(ent.getKey() + "=>" + ent.getValue());
		}
		
		
	}

}
