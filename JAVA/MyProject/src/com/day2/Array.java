package com.day2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[5];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The array elements: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of Array: "+sum);
		
		sc.close();
	}

}
