package com.hackerrank.java.datastructure;

import java.util.Scanner;

public class Array1DPart2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] sequences = new int[scanner.nextInt()][];
		int[] jumps = new int[sequences.length];

		for (int i = 0; i < sequences.length; i++) {
			sequences[i] = new int[scanner.nextInt()];
			jumps[i] = scanner.nextInt();

			for (int j = 0; j < sequences[i].length; j++) {
				sequences[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		for (int i = 0; i < sequences.length; i++) {
			System.out.println(sequenceSolveable(sequences[i], jumps[i]) ? "YES" : "NO");
		}
	}

	static boolean sequenceSolveable(int[] sequence, int jump) {
		return indexSolveable(sequence, jump, 0);
	}

	static boolean indexSolveable(int[] sequence, int jump, int i) {
		if (i >= sequence.length) {
			return true;
		}

		else if (i < 0 || sequence[i] == 1) {
			return false;
		}

		else {
			sequence[i] = 1;

			return indexSolveable(sequence, jump, i + 1) || indexSolveable(sequence, jump, i - 1)
					|| indexSolveable(sequence, jump, i + jump);
		}
	}
}
