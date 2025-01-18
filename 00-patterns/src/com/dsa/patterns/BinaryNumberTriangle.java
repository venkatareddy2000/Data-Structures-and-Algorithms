package com.dsa.patterns;

import java.util.Scanner;

public class BinaryNumberTriangle {

	public static void main(String[] args) {
		int size;
		int start = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the binary number triangle : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();
		}
		scanner.close();
	}

}
