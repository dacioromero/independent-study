package com.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalSorting
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int decimalCount = scanner.nextInt();
		
		String[] strings = new String[decimalCount];
		BigDecimal[] decimals = new BigDecimal[decimalCount];
		
		for(int i = 0; i < decimalCount; i++)
		{
			strings[i] = scanner.next();
			decimals[i] = new BigDecimal(strings[i]);
		}
		
		scanner.close();
		
		for(int i = 0; i < decimalCount; i++)
		{
			int largestIndex = i;
			
			for(int j = i; j < decimalCount; j++)
			{
				if(decimals[j].compareTo(decimals[largestIndex]) == 1)
				{
					largestIndex = j;
				}
			}
			
			BigDecimal tempDecimal = decimals[i];
			decimals[i] = decimals[largestIndex];
			decimals[largestIndex] = tempDecimal;
			
			String tempString = strings[i];
			strings[i] = strings[largestIndex];
			strings[largestIndex] = tempString;
		}
		
		for(int i = 0; i < decimalCount; i++)
		{
			System.out.println(strings[i]);
		}
	}
}
