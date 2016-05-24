package com.hackerrank.java.strings;

import java.util.Scanner;

public class StringsIntroduction
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String B = scanner.next();
        
        scanner.close();
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.printf("%s %s%n", A.substring(0, 1).toUpperCase() + A.substring(1), B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}