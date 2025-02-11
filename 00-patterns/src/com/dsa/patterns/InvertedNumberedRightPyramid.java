package com.dsa.patterns;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the inverted numbered right pyramid : ");
		size = scanner.nextInt();
		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
