package com.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerManipulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BigInteger a = new BigInteger(scanner.nextLine());
		BigInteger b = new BigInteger(scanner.nextLine());

		scanner.close();

		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
