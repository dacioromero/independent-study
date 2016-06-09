package com.hackerrank.java.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{}

public class ReflectionAttributes
{
	public static void main(String[] args)
	{
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        List<String> methodList = new ArrayList<String>();
        for(Method method : methods)
        {
            methodList.add(method.getName());
        }
        
        Collections.sort(methodList);
        
        for(String name: methodList)
        {
            System.out.println(name);
        }
    }
}
