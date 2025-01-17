package com.dsa.patterns;

import java.util.Scanner;

public class NumberCrown {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the right angled triangle : ");
		size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i; k < 2 * size - i; k++) {
				System.out.print("  ");
			}
			for (int l = i; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
