package org.hackerrank.java.datastructure;

import java.util.Scanner;

public class Array2D
{
	public static void main(String[] args)
	{
		int[][] array = new int[6][6];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length - 2; i++)
		{
			for(int j = 0; j < array[i].length - 2; j++)
			{
				int sum = array[i + 1][j + 1];
				
				for(int k = j; k < j + 3; k++)
				{
					sum += array[i][k] + array[i + 2][k];
				}
				
				max = Math.max(sum, max);
			}
		}
		
		System.out.println(max);
	}
}
