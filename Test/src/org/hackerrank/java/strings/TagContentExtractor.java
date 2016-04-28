package org.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TagContentExtractor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Pattern tagPattern = Pattern.compile("<(.*?)>[\\w\\s]*?<\\/\\1>");
		
		for(int testcases = Integer.parseInt(scanner.nextLine()); testcases > 0; testcases--)
		{
			String line = scanner.nextLine();
			
		}
	}
}
