package org.hackerrank.java.strings;

import java.util.Scanner;

public class StringCompare
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String string = scanner.next();
		int k = scanner.nextInt();
		
		scanner.close();
		
		if(string.length() >= k)
		{
			String smallest  = string.substring(0, k);
			String largest = smallest;
			
			for(int i = k + 1; i <= string.length(); i++)
			{
				String substring = string.substring(i - k, i);
				
				if(substring.compareTo(largest) > 0)
				{
					largest = substring;
				}
				
				if(substring.compareTo(smallest) < 0)
				{
					smallest = substring;
				}
			}
			
			System.out.println(smallest);
			System.out.println(largest);
		}
	}
}
