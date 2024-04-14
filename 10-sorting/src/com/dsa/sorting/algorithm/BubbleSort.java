package com.dsa.sorting.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	private void ascendingBubbleSort(int[] array, int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private void descendingBubbleSort(int[] array, int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Array before bubble sort : ");
		System.out.println(Arrays.toString(array));
		bubbleSort.ascendingBubbleSort(array, size);
		System.out.print("Array after ascending bubble sorting : ");
		System.out.println(Arrays.toString(array));
		bubbleSort.descendingBubbleSort(array, size);
		System.out.print("Array after descending bubble sorting : ");
		System.out.println(Arrays.toString(array));
	}

}
