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
		
		Pattern zeroPattern = Pattern.compile("0+");
		
		for(int i = 0; i < sequences.length; i++)
		{
			StringBuilder sequenceBuilder = new StringBuilder();
			
			for(int j = 0; j < sequences[i].length; j++)
			{
				sequenceBuilder.append(sequences[i][j]);
			}
			
			String sequence = sequenceBuilder.toString();
			
			Matcher zeroMatcher = zeroPattern.matcher(sequence);
			
			int currentIndex = 0;
			
			while(zeroMatcher.find(currentIndex))
			{
				for(currentIndex = zeroMatcher.end() - 1; !IndexBlocked(sequence, currentIndex) && !IndexBlocked(sequence, currentIndex + jumps[i]); currentIndex--);
				
				if(IndexBlocked(sequence, currentIndex))
				{
					break;
				}
				
				else
				{
					currentIndex += jumps[i];
				}
				
				if(currentIndex >= sequence.length()) 
				{
					break;
				}
			}
			
			System.out.println(currentIndex >= sequence.length() ? "YES" : "NO");
		}
    }
	
	static boolean IndexBlocked(String sequence, int index)
	{
		if(index < 0)
		{
			return true;
		}
		
		else if(index >= sequence.length())
		{
			return false;
		}
		
		else if(sequence.charAt(index) == 1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
