package com.hackerrank.java.oop;

class Bicycle {
	String define() {
		return "a vehicle with pedals.";
	}
}

class Motorcycle extends Bicycle {
	@Override
	String define() {
		return "a cycle with an engine.";
	}

	Motorcycle() {
		System.out.println("Hello I am a motorcycle, I am " + define());

		System.out.println("My ancestor is a cycle who is " + super.define());
	}

}

class SuperKeyword {
	public static void main(String[] argh) {
		new Motorcycle();
	}
}