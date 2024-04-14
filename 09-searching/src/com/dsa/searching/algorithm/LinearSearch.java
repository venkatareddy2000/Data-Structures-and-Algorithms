package com.dsa.searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	private int linearSearch(int[] array, int element) {
		if (array == null || array.length == 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the element you want to find it in the array : ");
		int element = scanner.nextInt();
		System.out.print("Array given for linear search : ");
		System.out.println(Arrays.toString(array));
		int index = linearSearch.linearSearch(array, element);
		if (index != -1) {
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element not found in the array");
		}

	}

}
