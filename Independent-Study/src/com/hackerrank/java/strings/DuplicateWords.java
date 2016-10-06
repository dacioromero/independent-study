package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords
{
    public static void main(String[] args)
    {
	    Pattern pattern = Pattern.compile("\\b(\\w+)(\\s+\\1)+\\b", Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
	
	    Scanner scanner = new Scanner(System.in);
	    
	    for(int testCases = Integer.parseInt(scanner.nextLine()); testCases > 0; testCases--)
	    {
	        String input = scanner.nextLine();
	       
	        Matcher matcher = pattern.matcher(input);
	        
	        while(matcher.find())
	        {
	            input = input.replaceAll(matcher.group(), matcher.group(1));
	        }
	        
	        System.out.println(input);
        }
	    
	    scanner.close();
    }
}
