package com.day5;

class TwoTable extends Thread {
	@Override
	public void run() {
		for(int i = 1;i <= 10; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class FiveTable implements Runnable {
	@Override
	public void run() {
		for(int i = 1;i <= 10; i++) {
			System.err.println("5 x " + i + " = " + (5*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Thread5 {

	public static void main(String[] args) {
		TwoTable t1 = new TwoTable();
		Thread t2 = new Thread(new FiveTable());
		
		t1.start();
		t2.start();
	}

}
