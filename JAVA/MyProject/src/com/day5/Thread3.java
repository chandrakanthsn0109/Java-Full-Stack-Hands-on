package com.day5;

public class Thread3 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread3 t1 = new Thread3();
		Thread3 t2 = new Thread3();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		Thread.sleep(2000);
		System.out.println("Main End");
	}

}
