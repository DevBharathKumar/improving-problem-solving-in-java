package org.bharath.problemsolving.qspidersjavaproblems;

public class SwapTwoNumbersWithoutUsingTemporaryVariable 
{
	public static void main(String[] args) 
	{
System.out.println("*********** SWAPPING TWO NUMBERS WITHOUT TEMP VARIABLE ***********");
		
		int a = -10;
		int b = -20;
		System.out.println("Before swaping a is "+a+" b is "+b);
		
		a = a+b;
		b = a -b;
		a = a -b;
		
		System.out.println("After swaping a is "+a+" b is "+b);
		
	}
}
