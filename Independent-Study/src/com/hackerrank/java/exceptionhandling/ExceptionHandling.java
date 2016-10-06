package com.hackerrank.java.exceptionhandling;

import java.util.Scanner;

class myCalculator
{
    public int power(int n, int p) throws Exception
    {
        if(n < 0 || p < 0)
        {
            throw new Exception("n and p should be non-negative");
        }
        
        return (int)Math.pow(n, p);
    }
}

class ExceptionHandling
{
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            
            myCalculator calculator = new myCalculator();
            
            try
            {
                System.out.println(calculator.power(n,p));
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        scanner.close();
    }
}