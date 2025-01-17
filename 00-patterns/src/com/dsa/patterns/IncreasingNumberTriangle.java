package com.dsa.patterns;

import java.util.Scanner;

public class IncreasingNumberTriangle {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the right angled triangle : ");
		size = scanner.nextInt();
		int count = 1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

		scanner.close();
	}
}
