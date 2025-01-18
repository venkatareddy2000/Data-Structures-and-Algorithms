package com.dsa.patterns;

import java.util.Scanner;

public class CompactRectangular {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the compact rectangular : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
				if (j != size - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
