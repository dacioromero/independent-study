package com.hackerrank.java.introduction;

import java.util.Scanner;

public class StdinStdout2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		double y = scanner.nextDouble();
		scanner.nextLine();
		String s = scanner.nextLine();

		scanner.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);
	}
}