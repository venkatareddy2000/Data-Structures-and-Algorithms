package com.dsa.patterns;

import java.util.Scanner;

public class RectangularStar {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the rectangular : ");
		size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
