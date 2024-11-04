package com.day3;

interface VehiclePlan1 {
	void noOfEngine();
}

interface VehiclePlan2 {
	void noOfWheels();
	void brandName();
}

abstract class Vehicles implements VehiclePlan1, VehiclePlan2 {
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
}

class Bikes extends Vehicles {
	public void noOfWheels() {
		System.out.println("I have two Wheels");
	}

	public void brandName() {
		System.out.println("Brand Name is Honda");
	}
}



public class Abstract1 {

	public static void main(String[] args) {
		Vehicles obj = new Bikes();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
	}

}
