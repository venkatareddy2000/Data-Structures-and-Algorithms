package com.dsa.patterns;

import java.util.Scanner;

public class RightAngledStar {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the right angled : ");
		size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
