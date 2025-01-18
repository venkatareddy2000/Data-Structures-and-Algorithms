package com.dsa.patterns;

import java.util.Scanner;

public class PalindromicNumberPyramid {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the palindromic number pyramid : ");
		size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
