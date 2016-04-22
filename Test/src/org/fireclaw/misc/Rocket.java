package org.fireclaw.misc;

public class Rocket
{
	public static void main(String[] args) throws InterruptedException
	{
		for(int i = 10; i > 0; i--)
		{
			System.out.println(i + "...");
		    Thread.sleep(1000);
		}
		
		System.out.println("Blast off!");
    }
}