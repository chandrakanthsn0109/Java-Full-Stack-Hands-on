package com.day4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public String toString() {
		return "Invalid age to vote";
	}
}

public class Exception2 {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the Age: ");
			int age = new Scanner(System.in).nextInt();

			if(age < 18) {
				throw new InvalidAgeException();
			}else {
				System.out.println("Welcome to vote");
			}
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
