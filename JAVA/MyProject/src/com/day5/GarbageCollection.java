package com.day5;

public class GarbageCollection {
	
	static int count;
	
	public GarbageCollection() {
		count++;
		System.out.println(count);
	}
	
	@Override
	protected void finalize()  {
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		GarbageCollection g1 = new GarbageCollection();
		GarbageCollection g2 = new GarbageCollection();
		
		g1 = null;
		System.gc();
		
		g2 = null;
		Runtime.getRuntime().gc();
	}

}
