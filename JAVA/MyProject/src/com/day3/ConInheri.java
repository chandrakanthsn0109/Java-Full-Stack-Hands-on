package com.day3;

class TwoWheeler1{
	TwoWheeler1() {
		this(7);
		System.out.println("Two Wheeler.");
	}
	
	TwoWheeler1(int a) {
		System.out.println("Two Wheeler-1.");
	}
}

class Bike1 extends TwoWheeler1{
	Bike1() {
		System.out.println("Bike.");
	}
}

public class ConInheri {

	public static void main(String[] args) {
		Bike1 bike = new Bike1();

	}

}
