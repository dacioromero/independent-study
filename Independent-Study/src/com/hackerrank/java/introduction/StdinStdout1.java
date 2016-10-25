package com.hackerrank.java.introduction;

import java.util.Scanner;

public class StdinStdout1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println(scanner.nextInt());
		}

		scanner.close();
	}
}