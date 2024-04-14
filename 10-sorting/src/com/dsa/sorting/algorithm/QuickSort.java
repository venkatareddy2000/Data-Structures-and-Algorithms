package com.dsa.sorting.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	private void ascendingQuickSort(int[] array, int low, int high) {
		if (low < high) {
			int partitionIndex = ascendingPartiton(array, low, high);
			ascendingQuickSort(array, low, partitionIndex - 1);
			ascendingQuickSort(array, partitionIndex + 1, high);
		}

	}

	private int ascendingPartiton(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);

		return i + 1;
	}

	private void descendingQuickSort(int[] array, int low, int high) {
		if (low < high) {
			int partitionIndex = descendingPartiton(array, low, high);
			descendingQuickSort(array, low, partitionIndex - 1);
			descendingQuickSort(array, partitionIndex + 1, high);
		}

	}

	private int descendingPartiton(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] > pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);

		return i + 1;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Array before quick sort : ");
		System.out.println(Arrays.toString(array));
		quickSort.ascendingQuickSort(array, 0, size - 1);
		System.out.println("Array after ascending quick sort : ");
		System.out.println(Arrays.toString(array));
		quickSort.descendingQuickSort(array, 0, size - 1);
		System.out.println("Array after descending quick sort : ");
		System.out.println(Arrays.toString(array));
	}

}
