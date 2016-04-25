package org.hackerrank.java.strings;

import java.util.Scanner;

public class StringReverse
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder string = new StringBuilder(scanner.next().toUpperCase());
        
        scanner.close();
        
        System.out.println(string.toString().equals(string.reverse().toString()) ? "Yes" : "No");
	}
}