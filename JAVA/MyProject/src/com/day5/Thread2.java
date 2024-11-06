package com.day5;

public class Thread2 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("My Thread is Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread2 t1 = new Thread2();
		
		t1.start();
		
		Thread.sleep(2000);
		System.out.println("Main End");
	}

}
