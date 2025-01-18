package com.dsa.patterns;

import java.util.Scanner;

public class RightAlignedRectangle {
	public static void main(String[] args) {
		int rows;
		int columns;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows of the right aligned rectangle : ");
		rows = scanner.nextInt();
		System.out.println("Enter the columns of the right aligned rectangle : ");
		columns = scanner.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j < rows - i - 1 || j > columns - i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
