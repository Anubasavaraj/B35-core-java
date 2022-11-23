package org.tnsindia.encapsulationdemo;

import org.tnsindia.accessspecifierdemo.Publicdemo;
public class Hdfcexecutor {
	
	public static void main(String[] args) {
Hdfc h=new Hdfc();
	
		
		//setters method is used for a to set a value
		h.setAmount(84760);
		//getter method is used to return a value
		System.out.println("The amount is: "+h.getAmount());
		
		
		//Driver code for PublicDemo class
		/*if any data member is declared as public we can access
		anywhere*/
		Publicdemo p=new Publicdemo();
		p.print(4376.98);

	}

}
