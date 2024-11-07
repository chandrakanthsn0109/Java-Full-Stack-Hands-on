package com.day6;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(10, "Java");
		tm.put(7, "Python");
		tm.put(3, "C#");
		tm.put(101, "C++");
//		tm.put(null, "PHP");
		
		System.out.println(tm.descendingMap());
		
		System.out.println(tm.get(101));
		
//		tm.remove(null);
		System.out.println(tm);
		
		//Traversing Map
        //Way-1
		System.out.println("============");
		Set<Integer> keys = tm.keySet();
		System.out.println(keys);
		for(Integer k : keys) {
			System.out.println(k + "=>" + tm.get(k));
		}
		
		//Way-2
		System.out.println("============");
		Set<Entry<Integer, String>> en = tm.entrySet();
		System.out.println(en);
		Iterator<Entry<Integer, String>> it = en.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> ent = it.next();
			System.out.println(ent.getKey() + "=>" + ent.getValue());
		}
		
		
	}

}
