package com.dsa.arrays.onedimensional;

import java.util.Arrays;

public class OneDimenstionalArrayCustomInput {

	public static void main(String[] args) {

		/* Creating a new array */
		int[] array = new int[5];

		/*
		 * Assigning the values to the new array and we use array index to assign the
		 * values, the index starts from 0 to n-1
		 */
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		/* We can print the values of array using index */
		System.out.println("printing the values of the array using index : ");
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.println(array[4]);

		/*
		 * A different way to create an array. We can initialize the values to an array
		 * at the time of declaration
		 */
		int[] array1 = { 60, 70, 80, 90, 100 };

		/*
		 * We use for loop to print the values of an array To find the length of an
		 * array use arrayname.length and assign it to an int variable
		 */
		System.out.println("printing the values of the array using for loop : ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		/*
		 * If we try to access an index that is out of range, will throw
		 * ArrayIndexOutofBoundException
		 *
		 * System.out.println(array[5]);// ArrayIndexOutofBoundException
		 */

		/* Using for each loop to loop through the array */
		System.out.println("printing the array using for each loop : ");
		for (int elements : array) {
			System.out.println(elements);
		}

		/* updated the value at 0th index */
		array[0] = 100;
		/* printing the array using toString method from Arrays class */
		System.out.println("printing the array using toString mehtod Arrays class : ");
		System.out.println(Arrays.toString(array));
	}

}
