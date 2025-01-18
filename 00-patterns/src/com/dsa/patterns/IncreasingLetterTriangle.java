package com.dsa.patterns;

import java.util.Scanner;

public class IncreasingLetterTriangle {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the increasing letter triangle : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			int asciiValue = 65;
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (asciiValue + j));
			}
			System.out.println();
		}

		scanner.close();
	}
}
