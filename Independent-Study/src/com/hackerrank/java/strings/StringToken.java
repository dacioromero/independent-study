package com.hackerrank.java.strings;

import java.util.Scanner;

public class StringToken
{
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
      
      String string = scanner.nextLine().trim();              
      
      scanner.close();
      
      if(string.isEmpty())
      {
    	  System.out.println(0);
      }
      
      else
      {
	      String[] words = string.split("[^a-zA-Z]+");
	      
	      int wordCount = words.length;
	    		  
	      System.out.println(wordCount);
	      
	      for(int i = 0; i < wordCount; i++) 
	      {
	    	  System.out.println(words[i]);
	      }
      }
    }
}