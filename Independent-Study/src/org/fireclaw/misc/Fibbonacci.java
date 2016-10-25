package org.fireclaw.misc;

public class Fibbonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		for (int i = 0; i < 32; i++) {
			System.out.println("#" + (i + 1) + ": " + b);

			b += a;
			a = b - a;
		}
	}
}