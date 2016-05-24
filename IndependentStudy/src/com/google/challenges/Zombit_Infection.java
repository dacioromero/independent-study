package com.google.challenges;

import java.util.Arrays;

public class Zombit_Infection
{
	public static void main(String[] args)
	{
		int[][] population = new int[][]
		{
			new int[] {1, 2, 3},
			new int[] {2, 3, 4},
			new int[] {3, 2, 1}
		};
		
		System.out.println(Arrays.deepToString(answer(population, 0, 0, 2)));
		
		population = new int[][]
		{
			new int[] {6, 7, 2, 7, 6},
			new int[] {6, 3, 1, 4, 7}, 
			new int[] {0, 2, 4, 1, 10},
			new int[] {8, 1, 1, 4, 9},
			new int[] {8, 7, 4, 9, 9}
		};
		
		System.out.println(Arrays.deepToString(answer(population, 2, 1, 5)));
	}
	
    public static int[][] answer(int[][] population, int x, int y, int strength)
    {
    	rabbitInfect(population, x, y, strength);
        return population;
    }
    
    static void rabbitInfect(int[][] population, int x, int y, int strength)
    {
    	if(y >= 0 && y < population.length && x >= 0 && x < population[y].length && population[y][x] != -1 && population[y][x] <= strength)
    	{
    		population[y][x] = -1;
    		
    		for(int i = -1; i <= 1; i++)
    		{
    			rabbitInfect(population, x + i, y, strength);
    			rabbitInfect(population, x, y + i, strength);
    		}
    	}
    }
}
