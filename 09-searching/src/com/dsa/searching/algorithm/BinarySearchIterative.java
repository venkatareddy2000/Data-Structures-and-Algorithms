package com.dsa.searching.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIterative {

	private int binarySearch(int[] array, int element, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == element) {
				return mid;
			} else if (array[mid] < element) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchIterative binarySearchIterative = new BinarySearchIterative();
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
		System.out.print("Array given for binary search : ");
		System.out.println(Arrays.toString(array));
		int index = binarySearchIterative.binarySearch(array, element, 0, size - 1);
		if (index != -1) {
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element not found in the array");
		}
	}

}
