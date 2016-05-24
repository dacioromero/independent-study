package com.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams
{
   static boolean isAnagram(String A, String B)
   {
	   if(A.length() != B.length())
	   {
		   return false;
	   }
	   
	   char[] A_chars = A.toUpperCase().toCharArray();
	   char[] B_chars = B.toUpperCase().toCharArray();
	   
	   Arrays.sort(A_chars);
	   Arrays.sort(B_chars);
	   
	   return Arrays.equals(A_chars, B_chars);
   }
   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String B = scanner.next();
        
        scanner.close();
        
        if(isAnagram(A, B))
		{
        	System.out.println("Anagrams");
        }
        else
        {
        	System.out.println("Not Anagrams");
        }
    }
}