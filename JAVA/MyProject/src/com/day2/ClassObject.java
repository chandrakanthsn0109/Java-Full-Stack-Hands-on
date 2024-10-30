package com.day2;

//Encapsulation and Java Bean
class Mobile {
	private String brandName;
	private int price;
	
	Mobile(String brandName, int price) {
		this.brandName = brandName;
		this.price = price;
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Price: " + price);
	}
}

public class ClassObject {

	public static void main(String[] args) {
		Mobile samsung = new Mobile("Samsung", 10000);
		samsung.display();
		
		samsung.setPrice(15000);
		samsung.display();
	}

}