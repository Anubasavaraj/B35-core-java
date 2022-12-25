package org.tnsindia.datetime;



import java.time.Clock;
public class Example4{
	
	private static Clock c;

	public static void main(String[] args) {
		
		c = Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1);

}
}