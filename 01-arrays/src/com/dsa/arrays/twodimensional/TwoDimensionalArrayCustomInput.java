package com.dsa.arrays.twodimensional;

import java.util.Arrays;

public class TwoDimensionalArrayCustomInput {

	public static void main(String[] args) {
		/* Creating a two dimensional array */

		int array[][] = new int[3][3];
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		array[2][0] = 70;
		array[2][1] = 80;
		array[2][2] = 90;

		/* Accessing a two dimensional array using for loop */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-------------------");

		/* Accessing a two dimensional array using for each loop */
		for (int k[] : array) {
			for (int l : k) {
				System.out.print(l + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int arr[] : array) {
			System.out.println(Arrays.toString(arr));
		}

		/* creating two dimensional array using a different way */
		int[][] array1 = { { 100, 200, 300 }, { 400, 500 }, { 700, 800, 900 } };
		System.out.println("-------------------");
		for (int i[] : array1) {
			System.out.println(Arrays.toString(i));
		}
		/* updating two dimensional array */
		array1[0][2] = 1000;
		System.out.println("-------------------");
		/* printing the array1 using the for loop */
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
