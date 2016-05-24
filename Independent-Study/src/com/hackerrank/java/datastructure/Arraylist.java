package com.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> integers = new ArrayList<ArrayList<Integer>>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = scanner.nextInt(); i > 0; i--)
		{
			ArrayList<Integer> line = new ArrayList<Integer>();
			
			for(int j = scanner.nextInt(); j > 0; j--)
			{
				line.add(scanner.nextInt());
			}
			
			integers.add(line);
		}
		
		for(int i = scanner.nextInt(); i > 0; i--)
		{
			try
			{
				System.out.println(integers.get(scanner.nextInt() - 1).get(scanner.nextInt() - 1));
			}
			
			catch(Exception e)
			{
				System.out.println("ERROR!");
			}
		}
		
		scanner.close();
	}
}
