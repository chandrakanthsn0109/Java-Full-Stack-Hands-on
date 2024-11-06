package com.day5;

// by implimenting Runnable interface
public class Thread4 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running...");
			try {
//				if(Thread.currentThread().getName().equals("T1")) {
//					Thread.sleep(1200);
//				}
//				if(Thread.currentThread().getName().equals("T2")) {
//					Thread.sleep(500);
//				}
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Thread4());
		Thread t2 = new Thread(new Thread4());
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
		Thread.sleep(500);
		t2.suspend();
		t1.join();
		t2.resume();
		System.out.println("Main End");
	}

}
