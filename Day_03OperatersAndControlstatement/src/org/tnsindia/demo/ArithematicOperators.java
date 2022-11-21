package org.tnsindia.demo;

import java.util.Scanner;

public class ArithematicOperators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("The addition is: "+(a+b));
		System.out.println("The subtraction is: "+(a-b));
		System.out.println("The multiplication is: "+(a*b));
		System.out.println("The division is: "+(a/b));
		System.out.println("The modulus is: "+(a%b));
		s.close();

	}

}
