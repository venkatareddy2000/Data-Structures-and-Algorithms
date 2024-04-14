package com.dsa.arrays.onedimensional;

import java.util.*;

public class OneDimenstionalArrayDynamicInput {

	/* passing array to the function parameter */
	private void updateValue(int[] array, int index, int value) {
		/* This is how to update the value at particular index */
		array[index] = value;
	}

	public static void main(String[] args) {
		OneDimenstionalArrayDynamicInput oneDimenstionalArrayExample2 = new OneDimenstionalArrayDynamicInput();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of values you are going to store in the array : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter the value at indext " + i + " : ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the index position where you want to update the value : ");
		int index = scanner.nextInt();
		System.out.println("Enter the value you want to update at the given index : ");
		int value = scanner.nextInt();
		oneDimenstionalArrayExample2.updateValue(array, index, value);
		System.out.print("Displaying the array : ");
		System.out.println(Arrays.toString(array));

	}

}
