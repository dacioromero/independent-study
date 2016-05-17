package org.hackerrank.java.introduction;

import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();            
        
        sc.close();
        
        boolean weird = number % 2 == 1 || (number >= 2 && number >= 6 && number <= 20);
        System.out.println((!weird ? "Not " : "") + "Weird");
    }
}