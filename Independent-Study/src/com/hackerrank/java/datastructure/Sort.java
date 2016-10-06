package com.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId()
	{
		return id;
	}

	public String getFname()
	{
		return fname;
	}

	public double getCgpa()
	{
		return cgpa;
	}

	@Override
	public int compareTo(Student a)
	{
		int cpgaOrder = -Double.compare(this.cgpa, a.getCgpa());

		if(cpgaOrder != 0)
		{
			return cpgaOrder;
		}

		else {
			int nameOrder = this.fname.compareTo(a.getFname());

			if(nameOrder != 0)
			{
				return nameOrder;
			}

			else
			{
				return Integer.compare(this.id, a.getId());
			}
		}
	}
}

public class Sort
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		List<Student> studentList = new ArrayList<Student>();
		
		for(int i = scanner.nextInt(); i > 0; i--)
		{
			studentList.add(new Student(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
		}

		scanner.close();

		Collections.sort(studentList);

		for(Student st : studentList)
		{
			System.out.println(st.getFname());
		}
	}
}
