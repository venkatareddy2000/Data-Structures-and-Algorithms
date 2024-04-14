package com.dsa.sorting.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	private void ascendingSelectionSort(int[] array, int size) {
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

	private void descendingSelectionSort(int[] array, int size) {
		for (int i = 0; i < size - 1; i++) {
			int max = i;
			for (int j = i + 1; j < size; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
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
		selectionSort.ascendingSelectionSort(array, size);
		System.out.print("Array after ascending selection sorting : ");
		System.out.println(Arrays.toString(array));
		selectionSort.descendingSelectionSort(array, size);
		System.out.print("Array after descending selection sorting : ");
		System.out.println(Arrays.toString(array));
	}

}
