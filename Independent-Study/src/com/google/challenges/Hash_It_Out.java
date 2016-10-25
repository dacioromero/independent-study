package com.google.challenges;

public class Hash_It_Out {
	public static void main(String[] args) {
		System.out.println(new int[] { 0, 129, 3, 129, 7, 129, 3, 129, 15, 129, 3, 129, 7, 129, 3, 129 });
		System.out.println(new int[] { 0, 129, 5, 141, 25, 137, 61, 149, 113, 145, 53, 157, 233, 185, 109, 165 });
	}

	public static int[] answer(int[] digest) {
		unhash(digest, digest.length - 1);

		return digest;
	}

	static void unhash(int[] digest, int i) {
		// Working on this.
	}
}