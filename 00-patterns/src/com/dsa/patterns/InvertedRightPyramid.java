package com.dsa.patterns;

import java.util.Scanner;

public class InvertedRightPyramid {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the right angled triangle : ");
		size = scanner.nextInt();
		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
