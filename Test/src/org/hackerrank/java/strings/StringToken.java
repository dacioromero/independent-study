package org.hackerrank.java.strings;

import java.util.Scanner;

public class StringToken
{
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
      
      String string = scanner.nextLine();
      
      scanner.close();
      
      String[] words = string.split("\\W+");
      
      int wordCount = words.length;
    		  
      System.out.println(wordCount);
      
      for(int i = 0; i < wordCount; i++) 
      {
    	  System.out.println(words[i]);
      }
    }
}
