package com.hackerrank.java.introduction;

import java.util.Scanner;

class Datatypes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = scanner.nextInt(); i > 0; i--) {
			try {
				long number = scanner.nextLong();

				System.out.printf("%d can be fitted in:%n", number);

				if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
					System.out.println("* byte");
				}

				if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
					System.out.println("* short");
				}

				if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}

				if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
			}

			catch (Exception e) {
				System.out.printf("%s can't be fitted anywhere.%n", scanner.next());
			}
		}

		scanner.close();
	}
}