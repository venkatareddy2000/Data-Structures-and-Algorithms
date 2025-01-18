package com.dsa.patterns;

import java.util.Scanner;

public class Sandglass {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the sandglass : ");
		size = scanner.nextInt();
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}
