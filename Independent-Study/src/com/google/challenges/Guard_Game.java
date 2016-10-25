package com.google.challenges;

import java.util.ArrayList;
import java.util.List;

public class Guard_Game {
	public static void main(String[] args) {
		System.out.println(answer(13));
		System.out.println(answer(1235));
	}

	public static int answer(int x) {
		int[] digits = getDigits(x);

		while (digits.length > 2) {
			digits = getDigits(sumIntArray(digits));
		}

		return sumIntArray(digits);
	}

	static int[] getDigits(int num) {
		List<Integer> digitList = new ArrayList<Integer>();

		while (num > 0) {
			digitList.add(num % 10);
			num /= 10;
		}

		if (digitList.size() == 0) {
			digitList.add(0);
		}

		int[] digitArray = new int[digitList.size()];

		for (int i = 0; i < digitArray.length; i++) {
			digitArray[i] = digitList.get(i);
		}

		return digitArray;
	}

	static int sumIntArray(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}
}