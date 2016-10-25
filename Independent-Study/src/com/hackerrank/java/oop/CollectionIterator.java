package com.hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionIterator {
	static Iterator iterateToPound(List list) {
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			Object element = iterator.next();

			if (element instanceof String) {
				break;
			}
		}

		return iterator;
	}

	public static void main(String[] argh) {
		List list = new ArrayList();

		Scanner scanner = new Scanner(System.in);

		int numInts = scanner.nextInt();
		int numStrings = scanner.nextInt();

		for (int i = 0; i < numInts; i++) {
			list.add(scanner.nextInt());
		}

		list.add("###");

		for (int i = 0; i < numStrings; i++) {
			list.add(scanner.next());
		}

		Iterator iterator = iterateToPound(list);

		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println((String) element);
		}
	}
}
