package com.dsa.patterns;

import java.util.Scanner;

public class InvertedHollowPyramid {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the inverted hollow pyramid : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < size * 2 - i - 1; k++) {
				if (i == 0 || k == i || k == size * 2 - i - 2) {
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
