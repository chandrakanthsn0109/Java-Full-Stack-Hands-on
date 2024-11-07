package com.day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(10, "Java");
		hm.put(7, "Python");
		hm.put(3, "C#");
		hm.put(101, "C++");
		hm.put(null, "PHP");
		
		System.out.println(hm);
		
		System.out.println(hm.get(101));
		
		hm.remove(null);
		System.out.println(hm);
		
		//Traversing Map
        //Way-1
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		for(Integer k : keys) {
			System.out.println(k + "=>" + hm.get(k));
		}
		
		//Way-2
		Set<Entry<Integer, String>> en = hm.entrySet();
		System.out.println(en);
		Iterator<Entry<Integer, String>> it = en.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> ent = it.next();
			System.out.println(ent.getKey() + "=>" + ent.getValue());
		}
		
		
	}

}
