package com.hackerrank.java.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {}

class Rockstar {}

class Hacker {}

public class InstanceofKeyword {
	static String count(List mylist)
	{
		int a = 0, b = 0, c = 0;
		
		for (int i = 0; i < mylist.size(); i++)
		{
			Object element = mylist.get(i);
			
			if (element instanceof Student)
			{
				a++;
			}
			else if (element instanceof Rockstar)
			{
				b++;
			}
			else if (element instanceof Hacker)
			{
				c++;
			}
		}
		
		return String.format("%d %d %d", a, b, c);
	}

	public static void main(String[] argh)
	{
		List mylist = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = scanner.nextInt(); i > 0; i--) {
			String className = scanner.next();
			
			if (className.equals("Student")) {
				mylist.add(new Student());
			}

			else if (className.equals("Rockstar"))
			{
				mylist.add(new Rockstar());
			}
			
			else if (className.equals("Hacker"))
			{
				mylist.add(new Hacker());
			}
		}
		
		System.out.println(count(mylist));
	}
}
