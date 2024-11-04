package com.day3;


public class Overloading{

	Overloading(){
		this(7);
		System.out.println("1");
	}

	Overloading(int a){
		System.out.println(a);
	}

	public static void main(String[] args) {

		Overloading over = new Overloading();
	}

}
