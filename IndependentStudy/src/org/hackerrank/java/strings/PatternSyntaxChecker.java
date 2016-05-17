package org.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int i = Integer.parseInt(scanner.nextLine()); i > 0; i--)
		{
			try
			{
				Pattern.compile(scanner.nextLine());
				
				System.out.println("Valid");
			}
			
			catch(PatternSyntaxException e)
			{
				System.out.println("Invalid");
			}
		}
		
		scanner.close();
	}
}
