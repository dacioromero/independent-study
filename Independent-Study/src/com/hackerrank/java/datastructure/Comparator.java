package com.hackerrank.java.datastructure;

import java.util.Comparator;

class Checker implements Comparator<Player> {
	@Override
	public int compare(Player a, Player b) {
		int scoreOrder = -Integer.compare(a.score, b.score);

		if (scoreOrder != 0) {
			return scoreOrder;
		}

		else {
			return a.name.compareTo(b.name);
		}
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}