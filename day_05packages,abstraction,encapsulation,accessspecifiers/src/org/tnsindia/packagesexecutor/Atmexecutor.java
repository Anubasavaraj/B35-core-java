package org.tnsindia.packagesexecutor;

import java.util.Scanner;

import org.tnsindia.packagesdemo.Atm;
public class Atmexecutor {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		Atm obj=new Atm();
		obj.display(card_no);
			s.close();

	}

}
