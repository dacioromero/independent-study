package test;

public class Fibbonacci
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		
		for(int i = 0; i < 32; i++)
		{
			System.out.println(b);
			
			b += a;
			a = b - a;
		}
	}
}