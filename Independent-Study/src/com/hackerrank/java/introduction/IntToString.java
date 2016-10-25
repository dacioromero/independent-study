package com.hackerrank.java.introduction;

import java.security.Permission;
import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();

		try {
			Scanner scanner = new Scanner(System.in);

			int number = scanner.nextInt();

			scanner.close();

			String string = Integer.toString(number);

			if (number == Integer.parseInt(string)) {
				System.out.println("Good job");
			}

			else {
				System.out.println("Wrong answer.");
			}
		}

		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

// The following class will prevent you from terminating the code using exit(0)!
class Do_Not_Terminate {
	public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};

		System.setSecurityManager(securityManager);

	}
}