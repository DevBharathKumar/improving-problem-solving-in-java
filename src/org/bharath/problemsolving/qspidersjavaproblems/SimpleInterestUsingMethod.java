package org.bharath.problemsolving.qspidersjavaproblems;

public class SimpleInterestUsingMethod 
{
	static double calculateSimpleInterest(double p,int n,double r)
	{
		return (p*n*r)/100;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(calculateSimpleInterest(2390, 1, 8.7));
	}
}
