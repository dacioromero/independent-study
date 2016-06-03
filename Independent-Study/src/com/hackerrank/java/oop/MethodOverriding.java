package com.hackerrank.java.oop;

class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers()
    {
        System.out.printf("Each team has n players in %s%n", getName());
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
    
    @Override
    void getNumberOfTeamMembers()
    {
    	System.out.printf("Each team has 11 players in %s%n", getName());
    }   
}

public class MethodOverriding
{
    public static void main(String []args)
    {
        Sports generalSports = new Sports();
        Soccer soccer = new Soccer();
        
        System.out.println(generalSports.getName());
        generalSports.getNumberOfTeamMembers();
        
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
	}
}