package com.dsa.arrays.twodimensional;

import java.util.*;

public class TwoDimenstionalArrayDynamicInput {

	/* passing array to the function parameter */
	private void updateValue(int[][] array, int row, int col, int value) {
		/* This is how to update the value at particular index */
		array[row][col] = value;
	}

	public static void main(String[] args) {
		TwoDimenstionalArrayDynamicInput oneDimenstionalArrayExample2 = new TwoDimenstionalArrayDynamicInput();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows you are going to store in the array : ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns you are going to store in the array : ");
		int columns = scanner.nextInt();
		int[][] array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter the value at indext " + i + j + " : ");
				array[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Displaying the array : ");
		for (int[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("Enter the row position where you want to update the value : ");
		int row = scanner.nextInt();
		System.out.println("Enter the column position where you want to update the value : ");
		int col = scanner.nextInt();
		System.out.println("Enter the value you want to update at the given index : ");
		int value = scanner.nextInt();
		oneDimenstionalArrayExample2.updateValue(array, row, col, value);
		System.out.println("Displaying the array : ");
		for (int[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
