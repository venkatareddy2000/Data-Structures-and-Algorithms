package com.dsa.patterns;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the hollow pyramid : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				if (i == size - 1 || k == 0 || k == 2 * i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
