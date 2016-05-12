package org.hackerrank.java.datastructure;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array1DPart2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[][] sequences = new int[scanner.nextInt()][];
		int[] jumps = new int[sequences.length];
		
		for(int i = 0; i < sequences.length; i++)
		{
			sequences[i] = new int[scanner.nextInt()];
			jumps[i] = scanner.nextInt();
			
			for(int j = 0; j < sequences[i].length; j++)
			{
				sequences[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		for(int i = 0; i < sequences.length; i++)
		{
			int sum = 0;
			
			for(int j = 0; j < sequences[i].length; j++)
			{
				sum += sequences[i][j];
			}
			
			boolean solveable = sum == 0;
			
			if(!solveable)
			{
				int index = 0;
				
				while(!solveable)
				{
					
				}
			}
			
			System.out.println(solveable ? "YES" : "NO");
		}
	}
	
	int IntArraySum(int[] array; int startIndex)
	{
		int sum = 0;
		
		for(int i = startIndex; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return sum;
	}
}
