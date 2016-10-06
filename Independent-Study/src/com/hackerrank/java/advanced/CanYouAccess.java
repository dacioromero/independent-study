package com.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class CanYouAccess
{
	public static void main(String[] args) throws Exception
	{
		Do_Not_Terminate.forbidExit();

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;
			
			CanYouAccess.Inner inner = new CanYouAccess.Inner();
			o = (Object)inner.new Private();
			System.out.printf("%d is %s%n", num, ((CanYouAccess.Inner.Private)o).powerof2(num));
		}

		catch (Do_Not_Terminate.ExitTrappedException e)
		{
			System.out.println("Unsuccessful Termination!!");
		}
	}

	static class Inner
	{
		private class Private
		{
			private String powerof2(int num) 
		{
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}

}

class Do_Not_Terminate
{
	public static class ExitTrappedException extends SecurityException 
	{
		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit()
	{
		final SecurityManager securityManager = new SecurityManager()
		{
			@Override
			public void checkPermission(Permission permission)
			{
				if (permission.getName().contains("exitVM"))
				{
					throw new ExitTrappedException();
				}
			}
		};
		
		System.setSecurityManager(securityManager);
	}
}
