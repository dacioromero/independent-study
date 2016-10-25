package com.hackerrank.java.oop;

import java.util.Scanner;

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Book {
	@Override
	void setTitle(String _title) {
		title = _title;
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		MyBook new_novel = new MyBook();

		Scanner scanner = new Scanner(System.in);

		new_novel.setTitle(scanner.nextLine());

		scanner.close();

		System.out.println("The title is: " + new_novel.getTitle());
	}
}
