package com.google.challenges;

public class Maximum_Equality
{   
	public static void main(String[] args)
	{
		System.out.println(answer(new int[] {1, 4, 1}));
		System.out.println(answer(new int[] {1, 2}));
	}
	
    public static int answer(int[] x)
    { 
    	return sumIntArray(x) % x.length == 0 ? x.length : x.length - 1;
    }
    
    static int sumIntArray(int[] array)
    {
    	int sum = 0;
    	
    	for(int i = 0; i < array.length; i++)
    	{
    		sum += array[i];
    	}
    	
    	return sum;
    }
}