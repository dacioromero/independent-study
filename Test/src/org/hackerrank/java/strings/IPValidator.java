package org.hackerrank.java.strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IPValidator
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext())
        {
            String IP = scanner.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
        
        scanner.close();
    }
}


class myRegex
{
	public String pattern = "((0?\\d\\d|0?\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5]).){3}(0?\\d\\d|0?\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
}