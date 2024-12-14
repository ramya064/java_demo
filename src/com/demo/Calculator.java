/*package com.demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			// check all the scenarios
			// hELLO
			int choice = scanner.nextInt();
			if (choice == 5) {
				System.out.println("Exit");
				System.exit(0);

			}
			System.out.println("Enter a value");
		int a = scanner.nextInt();
			System.out.println("Enter b value");
			int b = scanner.nextInt();
			System.out.println(b);

			if (choice == 1) {
				calculator.add(a, b);

			} else if (choice == 2) {
				calculator.sub(a, b);
			} else if (choice == 3) {
				calculator.mul(a, b);
			} else if (choice == 4) {
				calculator.div(a, b);
			}
		}

	}

	public void add(int a, int b) {
		int res = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + res);
	}

	public void sub(int a, int b) {
		int res = a - b;
		System.out.println("The difference between " + a + " and " + b + " is " + res);
	}

	public void mul(int a, int b) {
		int res = a * b;
		System.out.println("The product of " + a + " and " + b + " is " + res);
	}

	public void div(int a, int b) {
		int res = a / b;
		System.out.println("The division of " + a + " and " + b + " is " + res);
	}

}*/
