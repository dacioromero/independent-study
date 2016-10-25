package com.hackerrank.java.datastructure;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashSet<String> pairSet = new HashSet<String>();

		for (int i = Integer.parseInt(scanner.nextLine()); i > 0; i++) {
			pairSet.add(scanner.nextLine());

			System.out.println(pairSet.size());
		}

		scanner.close();
	}
}
