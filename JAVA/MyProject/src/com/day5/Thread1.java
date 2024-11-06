package com.day5;

// By extending thread class
public class Thread1 extends Thread {
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());
		System.out.println(t.getState());
		
		System.out.println(t.hashCode());
		
		Thread1 t1 = new Thread1();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.setName("T1");
		t1.setPriority(7);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
	}

}