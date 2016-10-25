package com.hackerrank.java.oop;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate {
	Scanner scanner = new Scanner(System.in);
	static Volume volume = new Volume();
	Output output = new Output();

	public int getINTVal() throws IOException {
		int val = scanner.nextInt();

		if (val <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}

		return val;
	}

	public double getDoubleVal() throws IOException {
		double val = scanner.nextDouble();

		if (val <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}

		return val;
	}

	public static Volume get_Vol() {
		return volume;
	}
}

class Volume {
	public int main(int a) {
		return (int) Math.pow(a, 3);
	}

	public int main(int l, int b, int h) {
		return l * b * h;
	}

	public double main(double r) {
		return (2 * Math.PI * Math.pow(r, 3)) / 3;
	}

	public double main(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;
	}
}

class Output {
	public void display(double volume) {
		System.out.printf("%.3f%n", volume);
	}
}

public class CalculateVolume {
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try {
			Calculate cal = new Calculate();

			int T = cal.getINTVal();

			while (T-- > 0) {
				double volume = 0.0d;

				switch (cal.getINTVal()) {
				case 1:
					volume = Calculate.get_Vol().main(cal.getINTVal());
					break;

				case 2:
					volume = Calculate.get_Vol().main(cal.getINTVal(), cal.getINTVal(), cal.getINTVal());
					break;

				case 3:
					volume = Calculate.get_Vol().main(cal.getDoubleVal());
					break;

				case 4:
					volume = Calculate.get_Vol().main(cal.getDoubleVal(), cal.getDoubleVal());
					break;
				}

				cal.output.display(volume);
			}

		}

		catch (NumberFormatException e) {
			System.out.print(e);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

class Do_Not_Terminate {
	public static class ExitTrappedException extends SecurityException {
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