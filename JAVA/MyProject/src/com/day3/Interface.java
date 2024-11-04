package com.day3;

interface One {
	int a = 7; //public static final
}

interface Two {
	int a = 7;
}

interface Three extends One, Two {
	void sum();
}

class NormalClass implements Three {

	public void sum() {
		System.out.println(One.a+Two.a);
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Three three = new NormalClass();
		three.sum();
	}

}
