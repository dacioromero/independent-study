package com.hackerrank.java.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackBalanced {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			Deque<Character> stack = new ArrayDeque<Character>();

			for (char bracket : scanner.nextLine().toCharArray()) {
				if (stack.isEmpty()) {
					stack.push(bracket);
				}

				else {
					switch (bracket) {
					case ')':
						if (stack.peek() == '(') {
							stack.pop();
						}

						break;

					case ']':
						if (stack.peek() == '[') {
							stack.pop();
						}

						break;

					case '}':
						if (stack.peek() == '{') {
							stack.pop();
						}

						break;

					default:
						stack.push(bracket);

						break;
					}
				}
			}

			System.out.println(stack.isEmpty());
		}

		scanner.close();
	}
}
