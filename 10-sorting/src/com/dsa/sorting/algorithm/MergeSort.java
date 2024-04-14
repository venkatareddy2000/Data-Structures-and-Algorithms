package com.dsa.sorting.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	private void ascendingMergeSort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		int size = array.length;
		int mid = size / 2;
		int[] left = new int[mid];
		int[] right = new int[size - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = array[i];
		}
		ascendingMergeSort(left);
		ascendingMergeSort(right);
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (left[i] < right[j]) {
				array[k] = left[i];
				k++;
				i++;
			} else {
				array[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < leftSize) {
			array[k] = left[i];
			k++;
			i++;
		}
		while (j < rightSize) {
			array[k] = right[j];
			k++;
			j++;
		}
	}

	private void descendingMergeSort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		int size = array.length;
		int mid = size / 2;
		int[] left = new int[mid];
		int[] right = new int[size - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = array[i];
		}
		descendingMergeSort(left);
		descendingMergeSort(right);
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (left[i] > right[j]) {
				array[k] = left[i];
				k++;
				i++;
			} else {
				array[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < leftSize) {
			array[k] = left[i];
			k++;
			i++;
		}
		while (j < rightSize) {
			array[k] = right[j];
			k++;
			j++;
		}

	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.print("Array before merge sort : ");
		System.out.println(Arrays.toString(array));
		mergeSort.ascendingMergeSort(array);
		System.out.print("Array after ascending merge sort : ");
		System.out.println(Arrays.toString(array));
		mergeSort.descendingMergeSort(array);
		System.out.print("Array after descending merge sort : ");
		System.out.println(Arrays.toString(array));

	}

}
