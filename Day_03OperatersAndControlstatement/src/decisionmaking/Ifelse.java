package decisionmaking;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		//if..else statement(when two things will going be check)
		if(a>b)
		{
			System.out.println("A is greater"+a);
		}
		else
		{
			System.out.println("B is greater"+b);
			s.close();
		}

	}

}
