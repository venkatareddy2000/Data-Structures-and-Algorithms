package com.dsa.patterns;

import java.util.Scanner;

public class AlphaTriangle {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the alpha triangle : ");
		size = scanner.nextInt();
		for(int i =size;i>=1;i--) {
			for(int j = i;j<=size;j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		}

		scanner.close();
	}
}
