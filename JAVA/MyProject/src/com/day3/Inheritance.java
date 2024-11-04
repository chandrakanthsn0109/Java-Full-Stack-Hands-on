package com.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine.");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheel() {
		System.out.println("I have two Wheels.");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();
		
	}

}
