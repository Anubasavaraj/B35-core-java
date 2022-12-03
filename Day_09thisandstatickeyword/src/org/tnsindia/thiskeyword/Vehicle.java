package org.tnsindia.thiskeyword;

public class Vehicle {
	public int speed;
	public void display1(Vehicle v)
	{
		System.out.println("Speed is: "+speed+"Km/hr");
	}
	
	public void display2()
	{
		//passing this keyword as an argument to call display1()method
		display1(this);
}
}