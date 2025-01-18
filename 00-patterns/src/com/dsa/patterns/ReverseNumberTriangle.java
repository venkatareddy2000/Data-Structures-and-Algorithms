package com.dsa.patterns;

import java.util.Scanner;

public class ReverseNumberTriangle {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the reverse number triangle : ");
		size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
