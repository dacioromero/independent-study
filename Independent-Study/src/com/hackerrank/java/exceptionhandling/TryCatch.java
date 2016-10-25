package com.hackerrank.java.exceptionhandling;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println(scanner.nextInt() / scanner.nextInt());
		}

		catch (ArithmeticException e) {
			System.out.printf("%s: %s%n", e.getClass().getName(), e.getMessage().toLowerCase());
		}

		catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

		scanner.close();
	}
}