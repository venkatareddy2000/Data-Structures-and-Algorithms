package com.dsa.patterns;

import java.util.Scanner;

public class AlphaHill {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the right angled triangle : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				int asciiValue = 65;
				System.out.print((char) (asciiValue + k));
			}
			for (int l = i - 1; l >= 0; l--) {
				int asciiValue = 65;
				System.out.print((char) (asciiValue + l));
			}
			System.out.println();
		}

		scanner.close();
	}
}
