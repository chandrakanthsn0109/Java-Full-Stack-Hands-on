package com.day2;

public class Array2{

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[] {1, 2, 3};
	    arr[1] = new int[] {4, 5};
		arr[2] = new int[] {6, 7, 8, 9};
		
		System.out.println("The array elements: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +  " ");  
			}
			System.out.println();
		}

	}
}

