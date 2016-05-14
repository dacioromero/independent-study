package org.hackerrank.java.introduction;

import java.util.Scanner;

public class Loops
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int v = a;
			
			for(int j = 0; j < n; j++)
			{
				v += Math.pow(2, j) * b;
				
				System.out.printf("%d ", v);
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}