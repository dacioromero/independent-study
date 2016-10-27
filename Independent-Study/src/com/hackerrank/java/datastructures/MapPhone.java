package com.hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPhone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, String> phonebook = new HashMap<String, String>();

		for (int i = Integer.parseInt(scanner.nextLine()); i > 0; i--) {
			phonebook.put(scanner.nextLine(), scanner.nextLine());
		}

		while (scanner.hasNextLine()) {
			String key = scanner.nextLine();

			if (phonebook.containsKey(key)) {
				System.out.printf("%s=%s%n", key, phonebook.get(key));
			}

			else {
				System.out.println("Not found");
			}
		}

		scanner.close();
	}
}
