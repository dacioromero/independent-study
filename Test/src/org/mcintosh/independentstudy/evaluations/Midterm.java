package org.mcintosh.independentstudy.evaluations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Midterm 
{
	static String[] words = new String[]
	{
		"time",
		"person",
		"year",
		"way",
		"day",
		"thing",
		"man",
		"world",
		"life",
		"hand",
		"part",
		"child",
		"eye",
		"woman",
		"place",
		"work",
		"week",
		"case",
		"point",
		"government",
		"company",
		"number",
		"group",
		"problem",
		"fact"
	};

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			Menu();
		}
	}
	
	static void Menu()
	{
		int option = 0;
		
		do
		{
			try
			{
				System.out.println("Java Hangman");
				System.out.println("1. New Game");
				System.out.println("2. Quit");
			
				option = Integer.parseInt(scanner.next());
			}
			
			catch(Exception e)
			{
				System.out.println("Option must be numeric!");
			}
		}
		
		while(option < 1 || option > 2);
		
		switch(option)
		{
			case 1:
				Game();
				break;
			case 2:
				System.exit(1);
				break;
		}
	}
	
	static void Game()
	{
		String word = words[(int)(Math.random() * (words.length - 1))];
		
		StringBuilder charGuesses = new StringBuilder();
		ArrayList<String> wordGuesses = new ArrayList<String>();
		
		boolean win = false;
		
		for(int guessCount = word.length() * 2; guessCount > 0 && !win; guessCount--)
		{
			System.out.println(word.replaceAll(charGuesses.length() > 0 ? String.format("[^%s]", charGuesses) : ".", "_"));
			
			
			System.out.printf("%d guesses left%n", guessCount);
			
			String guess;
			boolean guessValid = false;
			
			do
			{
				System.out.println("Enter your guess");
				guess = scanner.next().toLowerCase();
				
				if(charGuesses.indexOf(guess) != -1 || wordGuesses.contains(guess))
				{
					System.out.printf("You've already guessed %s%n", guess);
				}
				
				else
				{
					guessValid = guess.matches("[A-Za-z]+");
				}
			}
			while(!guessValid);
			
			if(guess.length() == 1)
			{
				charGuesses.append(guess);
				
				win = word.matches(String.format("[%s]+", charGuesses));
			}
			
			else
			{
				wordGuesses.add(guess);
				
				win = guess.equals(word);
			}
		}
		
		System.out.printf("You%s win!%n", (win ? "" : " didn't"));
		System.out.printf("The word was %s%n", word);
		System.out.println("--------------------");
	}
}