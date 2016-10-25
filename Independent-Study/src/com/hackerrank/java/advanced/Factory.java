package com.hackerrank.java.advanced;

import java.security.Permission;
import java.util.Scanner;

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {
		try {
			return (Food) Class.forName(Character.toUpperCase(order.charAt(0)) + order.substring(1)).newInstance();
		}

		catch (Exception e) {
			return null;
		}
	}

}

public class Factory {
	public static void main(String args[]) {
		Do_Not_Terminate.forbidExit();

		try {
			Scanner scanner = new Scanner(System.in);

			FoodFactory foodFactory = new FoodFactory();

			Food food = foodFactory.getFood(scanner.nextLine());

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());

			scanner.close();
		}

		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}