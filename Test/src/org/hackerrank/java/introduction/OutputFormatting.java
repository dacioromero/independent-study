package org.hackerrank.java.introduction;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++)
        {
            System.out.printf("%-15s%03d\n", sc.next(), sc.nextInt());
        }
        
        sc.close();
        
        System.out.println("================================");
    }
}