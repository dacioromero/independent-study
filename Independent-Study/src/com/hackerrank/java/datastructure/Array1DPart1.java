package com.hackerrank.java.datastructure;

import java.util.Scanner;

public class Array1DPart1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] integers = new int[scanner.nextInt()];

		for (int i = 0; i < integers.length; i++) {
			integers[i] = scanner.nextInt();
		}

		scanner.close();

		int negativeSubs = 0;

		for (int i = 0; i < integers.length; i++) {
			int sum = 0;

			for (int j = i; j < integers.length; j++) {
				sum += integers[j];

				if (sum < 0) {
					negativeSubs++;
				}
			}
		}

		System.out.println(negativeSubs);
	}
}
