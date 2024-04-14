package com.dsa.sorting.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	private void ascendingInsertionSort(int[] array, int size) {
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	private void descendingInsertionSort(int[] array, int size) {
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Array before selection sort : ");
		System.out.println(Arrays.toString(array));
		insertionSort.ascendingInsertionSort(array, size);
		System.out.print("Array after ascending selection sorting : ");
		System.out.println(Arrays.toString(array));
		insertionSort.descendingInsertionSort(array, size);
		System.out.print("Array after descending selection sorting : ");
		System.out.println(Arrays.toString(array));
	}

}
