package org.hackerrank.java.datastructure;

import java.util.Scanner;

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
			int currentIndex = 0;
			int currentStart = 0;
			boolean solveable = false;
			
			while(!solveable)
			{
				if(sequences[i][currentIndex + jumps[i]] == 0)
				{
					currentIndex += jumps[i];
					
				}
			}
		}
    }
}
