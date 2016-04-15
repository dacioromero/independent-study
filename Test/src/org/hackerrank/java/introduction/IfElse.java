package org.hackerrank.java.introduction;

import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            
        sc.close();
        
        boolean weird = n % 2 == 1 || (n >= 2 && n >= 6 && n <= 20);
        System.out.println((!weird ? "Not " : "") + "Weird");
    }
}