package com.hackerrank.java.oop;

import java.util.Scanner;

interface AdvancedArithmetic
{
	public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic 
{
	@Override
	public int divisorSum(int n) 
	{
		int sum = n;
		
		for(int i = 1; i <= n / 2; i++)
		{
			if(n % i == 0)
			{
				sum += i;
			}
		}
		
		return sum;
	}
}

class Interface
{
    public static void main(String []argh)
    {
        MyCalculator calculator = new MyCalculator();
        
        System.out.print("I implemented: ");
        
        ImplementedInterfaceNames(calculator);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(calculator.divisorSum(scanner.nextInt()));
        
        scanner.close();
    }
    
    static void ImplementedInterfaceNames(Object o)
    {
        Class[] interfaces = o.getClass().getInterfaces();
        
        for (int i = 0; i < interfaces.length; i++)
        {
            System.out.println(interfaces[i].getName());
        }
    }
}