package com.hackerrank.java.introduction;

import java.util.Scanner;

public class Loops1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = scanner.nextInt(); i > 0; i--) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();

			int v = a;

			for (int j = 0; j < n; j++) {
				v += Math.pow(2, j) * b;

				System.out.printf("%d ", v);
			}

			System.out.println();
		}

		scanner.close();
	}
}