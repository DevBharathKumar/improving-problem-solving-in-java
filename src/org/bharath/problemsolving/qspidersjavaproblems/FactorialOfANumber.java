package org.bharath.problemsolving.qspidersjavaproblems;

public class FactorialOfANumber {

	static int findFactorial(int number)
	{
		int result = 1;
		
		for(int i=1; i<=number;i++)
		{
			result = result * i;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("The factorial of 5 is "+findFactorial(5));
	}

}
