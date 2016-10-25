package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameChecker {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]\\w{7,29}$");

		Scanner scanner = new Scanner(System.in);
		for (int testcases = Integer.parseInt(scanner.nextLine()); testcases > 0; testcases--) {
			Matcher matcher = pattern.matcher(scanner.nextLine());

			if (matcher.find()) {
				System.out.println("Valid");
			}

			else {
				System.out.println("Invalid");
			}
		}

		scanner.close();
	}
}
