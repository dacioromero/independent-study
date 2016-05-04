package org.mcintosh.independentstudy.evaluations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

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
				System.out.println("Hangman");
				System.out.println("1. New Game");
				System.out.println("2. Quit");
			
				option = Integer.parseInt(scanner.next());
			}
			
			catch(Exception e)
			{
				System.out.println("Option must be numeric!");
			}
		}
		while(option == 0);
		
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
		StringBuilder guessRegex = new StringBuilder();
		
		boolean win = false;
		
		System.out.println(word.replaceAll(".", "_ "));
		
		for(int guessCount = word.length() * 4; guessCount > 0 && !win; guessCount--)
		{
			System.out.printf("%d guesses left%n", guessCount);
			
			String guess;
			
			do
			{
				System.out.println("Enter your guess");
				guess = scanner.next();
				
				if(guess == word)
				{
					System.out.println(word.replaceAll(".", "$0"));
					win = true;
					break;
				}
			}
			while(guess.matches("[^A-Za-z]") || guess.length() != 1 || guessRegex.indexOf(guess) != -1);
			
			guessRegex.append(guess);
			
			String revealed = word.replaceAll("[^" + guessRegex + "]", "_");
			
			System.out.println(revealed.replaceAll("\\B", " "));
			
			win = revealed == word;
		}
		
		System.out.println("You" + (!win ? " didn't" : "") + " win");
	}
	
	static void ClearScreen()
	{
		for(int i = 0; i < 1024; i++)
		{
		    System.out.println("\b");
		}
	}
}