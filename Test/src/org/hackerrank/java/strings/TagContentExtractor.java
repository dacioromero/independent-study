package org.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Pattern fullPattern = Pattern.compile("<([^<>]+)>[^><]+<\\/\\1>");
		Pattern contentPattern = Pattern.compile("(?<=>)[^><]+(?=<)");
		
		for(int testcases = Integer.parseInt(scanner.nextLine()); testcases > 0; testcases--)
		{
			String line = scanner.nextLine();
			
			Matcher fullMatcher = fullPattern.matcher(line);
			
			if(fullMatcher.matches())
			{
				System.out.println(fullMatcher.group());
				
				//Matcher contentMatcher = contentPattern.matcher(fullMatcher.group());
				//System.out.println(contentMatcher.group());
			}
		}
		
		scanner.close();
	}
}
